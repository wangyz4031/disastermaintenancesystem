package com.bjjw.dmsmaintenanceservice.serviceimpl;

import com.bjjw.dmsmaintenanceservice.entity.StationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.List;

@Service
public class StationXmlServiceImpl extends XmlServiceImpl<StationEntity>{
    @Autowired
    private Environment environment;
    @Override
    protected void Sort(List<StationEntity> stationEntityList){
        stationEntityList.sort((a, b) -> Integer.parseInt(a.getId()) - Integer.parseInt(b.getId()));
    }
    @Override
    protected StationEntity getEntityByXmlFile(Document document, int i) {
        StationEntity stationEntity = new StationEntity();
        String id = document.getElementsByTagName("S_ID").item(i).getFirstChild().getNodeValue();
        String stationname = document.getElementsByTagName("S_STATIONNAME").item(i).getFirstChild().getNodeValue();
        String linename = document.getElementsByTagName("S_LINENAME").item(i).getFirstChild().getNodeValue();
        String linecode = document.getElementsByTagName("S_LINECODE").item(i).getFirstChild().getNodeValue();
        int km = Integer.parseInt(document.getElementsByTagName("I_KM").item(i).getFirstChild().getNodeValue());
        int meter = Integer.parseInt(document.getElementsByTagName("I_METER").item(i).getFirstChild().getNodeValue());
        int sortid = Integer.parseInt(document.getElementsByTagName("I_SORTID").item(i).getFirstChild().getNodeValue());
        int ableflag = Integer.parseInt(document.getElementsByTagName("C_ABLEFLAG").item(i).getFirstChild().getNodeValue());
        stationEntity.setId(id);
        stationEntity.setStationName(stationname);
        stationEntity.setLineName(linename);
        stationEntity.setLineCode(linecode);
        stationEntity.setKm(km);
        stationEntity.setMeter(meter);
        stationEntity.setSortId(sortid);
        stationEntity.setAbleFlag(ableflag);
        return stationEntity;
    }

    @Override
    public String getFilePath() {
        return environment.getProperty("stationpath");
    }

    @Override
    public boolean updateXML(StationEntity newEntity,StationEntity originalEntity,Document document,int i){
        document.getElementsByTagName("S_STATIONNAME").item(i).getFirstChild().setNodeValue(newEntity.getStationName());
        document.getElementsByTagName("S_LINENAME").item(i).getFirstChild().setNodeValue(newEntity.getLineName());
        document.getElementsByTagName("S_LINECODE").item(i).getFirstChild().setNodeValue(newEntity.getLineCode());
        document.getElementsByTagName("I_KM").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getKm()));
        document.getElementsByTagName("I_METER").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getMeter()));
        document.getElementsByTagName("I_SORTID").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getSortId()));
        document.getElementsByTagName("C_ABLEFLAG").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getAbleFlag()));
        saveXML(document, getFilePath());
        return true;
    }

    @Override
    public boolean addXML(StationEntity newEntity,Document document){
        Element eltTable = document.createElement("Table");
        Element eltId = document.createElement("S_ID");
        Element eltStationName = document.createElement("S_STATIONNAME");
        Element eltLineName = document.createElement("S_LINENAME");
        Element eltLineCode = document.createElement("S_LINECODE");
        Element eltKm = document.createElement("I_KM");
        Element eltMeter = document.createElement("I_METER");
        Element eltSortId = document.createElement("I_SORTID");
        Element eltAbleFlag = document.createElement("C_ABLEFLAG");

        eltId.appendChild(document.createTextNode(newEntity.getId()));
        eltStationName.appendChild(document.createTextNode(newEntity.getStationName()));
        eltLineName.appendChild(document.createTextNode(newEntity.getLineName()));
        eltLineCode.appendChild(document.createTextNode(newEntity.getLineCode()));
        eltKm.appendChild(document.createTextNode(newEntity.getKm() + ""));
        eltMeter.appendChild(document.createTextNode(newEntity.getMeter() + ""));
        eltSortId.appendChild(document.createTextNode(newEntity.getSortId() + ""));
        eltAbleFlag.appendChild(document.createTextNode(newEntity.getAbleFlag() + ""));

        eltTable.appendChild(eltId);
        eltTable.appendChild(eltStationName);
        eltTable.appendChild(eltLineName);
        eltTable.appendChild(eltLineCode);
        eltTable.appendChild(eltKm);
        eltTable.appendChild(eltMeter);
        eltTable.appendChild(eltSortId);
        eltTable.appendChild(eltAbleFlag);
        //获取根节点
        Element eltRoot = document.getDocumentElement();
        //把叶节点加入到根节点下
        eltRoot.appendChild(eltTable);
        //更新修改后的源文件
        saveXML(document, getFilePath());
        return true;
    }
    @Override
    protected boolean isExist(StationEntity stationEntity, String id){
        if (stationEntity.getId().equals(id)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    protected boolean isExist(StationEntity stationEntity,StationEntity baseStationEntity1){
        if (stationEntity.getId().equals(baseStationEntity1.getId())) {
            return true;
        }
        else {
            return false;
        }
    }
}
