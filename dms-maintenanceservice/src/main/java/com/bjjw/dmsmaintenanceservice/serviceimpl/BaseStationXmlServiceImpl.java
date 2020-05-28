package com.bjjw.dmsmaintenanceservice.serviceimpl;

import com.bjjw.dmsmaintenanceservice.entity.BaseStationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.List;

@Service
public class BaseStationXmlServiceImpl extends XmlServiceImpl<BaseStationEntity> {
    @Autowired
    private Environment environment;
    @Override
    protected void Sort(List<BaseStationEntity> baseStationEntityList){
        baseStationEntityList.sort((a, b) -> Integer.parseInt(a.getId()) - Integer.parseInt(b.getId()));
    }
    @Override
    protected BaseStationEntity getEntityByXmlFile(Document document, int i) {
        BaseStationEntity baseStationEntity = new BaseStationEntity();
        String id = document.getElementsByTagName("S_ID").item(i).getFirstChild().getNodeValue();
        String basestationname = document.getElementsByTagName("S_BASESTATIONNAME").item(i).getFirstChild().getNodeValue();
        String linename = document.getElementsByTagName("S_LINENAME").item(i).getFirstChild().getNodeValue();
        String linecode = document.getElementsByTagName("S_LINECODE").item(i).getFirstChild().getNodeValue();
        int km = Integer.parseInt(document.getElementsByTagName("I_KM").item(i).getFirstChild().getNodeValue());
        int meter = Integer.parseInt(document.getElementsByTagName("I_METER").item(i).getFirstChild().getNodeValue());
        int sortid = Integer.parseInt(document.getElementsByTagName("I_SORTID").item(i).getFirstChild().getNodeValue());
        int ableflag = Integer.parseInt(document.getElementsByTagName("C_ABLEFLAG").item(i).getFirstChild().getNodeValue());
        String aip = document.getElementsByTagName("S_AIP").item(i).getFirstChild().getNodeValue();
        String bip = document.getElementsByTagName("S_BIP").item(i).getFirstChild().getNodeValue();
        String upgradedatetime = document.getElementsByTagName("S_UPGRADEDATETIME").item(i).getFirstChild().getNodeValue();
//        String kilometer = document.getElementsByTagName("KILOMETER").item(i).getFirstChild().getNodeValue();
        baseStationEntity.setId(id);
        baseStationEntity.setBaseStationName(basestationname);
        baseStationEntity.setLineName(linename);
        baseStationEntity.setLineCode(linecode);
        baseStationEntity.setKm(km);
        baseStationEntity.setMeter(meter);
        baseStationEntity.setSortId(sortid);
        baseStationEntity.setAbleFlag(ableflag);
        baseStationEntity.setAip(aip);
        baseStationEntity.setBip(bip);
        baseStationEntity.setUpgradeDateTime(upgradedatetime);
        return baseStationEntity;
    }

    @Override
    public String getFilePath() {
        return  environment.getProperty("basestationpath");
    }

    @Override
    public boolean updateXML(BaseStationEntity newEntity,BaseStationEntity originalEntity,Document document,int i){
        Element baseStationName = (Element) document.getElementsByTagName("S_BASESTATIONNAME").item(i);
        baseStationName.getFirstChild().setNodeValue(newEntity.getBaseStationName());
        document.getElementsByTagName("S_LINENAME").item(i).getFirstChild().setNodeValue(newEntity.getLineName());
        document.getElementsByTagName("S_LINECODE").item(i).getFirstChild().setNodeValue(newEntity.getLineCode());
        document.getElementsByTagName("I_KM").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getKm()));
        document.getElementsByTagName("I_METER").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getMeter()));
        document.getElementsByTagName("I_SORTID").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getSortId()));
        document.getElementsByTagName("C_ABLEFLAG").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getAbleFlag()));
        document.getElementsByTagName("S_AIP").item(i).getFirstChild().setNodeValue(newEntity.getAip());
        document.getElementsByTagName("S_BIP").item(i).getFirstChild().setNodeValue(newEntity.getBip());
        document.getElementsByTagName("S_UPGRADEDATETIME").item(i).getFirstChild().setNodeValue(newEntity.getUpgradeDateTime());
        saveXML(document, getFilePath());
        return true;
    }

    @Override
    public boolean addXML(BaseStationEntity newEntity,Document document){
        Element eltTable = document.createElement("Table");
        Element eltId = document.createElement("S_ID");
        Element eltBaseStationName = document.createElement("S_BASESTATIONNAME");
        Element eltLineName = document.createElement("S_LINENAME");
        Element eltLineCode = document.createElement("S_LINECODE");
        Element eltKm = document.createElement("I_KM");
        Element eltMeter = document.createElement("I_METER");
        Element eltSortId = document.createElement("I_SORTID");
        Element eltAbleFlag = document.createElement("C_ABLEFLAG");
        Element eltAip = document.createElement("S_AIP");
        Element eltBip = document.createElement("S_BIP");
        Element eltUpgradeDateTime = document.createElement("S_UPGRADEDATETIME");

        eltId.appendChild(document.createTextNode(newEntity.getId()));
        eltBaseStationName.appendChild(document.createTextNode(newEntity.getBaseStationName()));
        eltLineName.appendChild(document.createTextNode(newEntity.getLineName()));
        eltLineCode.appendChild(document.createTextNode(newEntity.getLineCode()));
        eltKm.appendChild(document.createTextNode(newEntity.getKm() + ""));
        eltMeter.appendChild(document.createTextNode(newEntity.getMeter() + ""));
        eltSortId.appendChild(document.createTextNode(newEntity.getSortId() + ""));
        eltAbleFlag.appendChild(document.createTextNode(newEntity.getAbleFlag() + ""));
        eltAip.appendChild(document.createTextNode(newEntity.getAip()));
        eltBip.appendChild(document.createTextNode(newEntity.getBip()));
        eltUpgradeDateTime.appendChild(document.createTextNode(newEntity.getUpgradeDateTime()));

        eltTable.appendChild(eltId);
        eltTable.appendChild(eltBaseStationName);
        eltTable.appendChild(eltLineName);
        eltTable.appendChild(eltLineCode);
        eltTable.appendChild(eltKm);
        eltTable.appendChild(eltMeter);
        eltTable.appendChild(eltSortId);
        eltTable.appendChild(eltAbleFlag);
        eltTable.appendChild(eltAip);
        eltTable.appendChild(eltBip);
        eltTable.appendChild(eltUpgradeDateTime);
        //获取根节点
        Element eltRoot = document.getDocumentElement();
        //把叶节点加入到根节点下
        eltRoot.appendChild(eltTable);
        //更新修改后的源文件
        saveXML(document, getFilePath());
        return true;
    }
    @Override
    protected boolean isExist(BaseStationEntity baseStationEntity,String id){
        if (baseStationEntity.getId().equals(id)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    protected boolean isExist(BaseStationEntity baseStationEntity,BaseStationEntity baseStationEntity1){
        if (baseStationEntity.getId().equals(baseStationEntity1.getId())) {
            return true;
        }
        else {
            return false;
        }
    }
}
