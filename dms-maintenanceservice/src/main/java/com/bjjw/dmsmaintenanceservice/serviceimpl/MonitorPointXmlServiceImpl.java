package com.bjjw.dmsmaintenanceservice.serviceimpl;

import com.bjjw.dmsmaintenanceservice.entity.MonitorPointEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonitorPointXmlServiceImpl extends XmlServiceImpl<MonitorPointEntity>{
    @Autowired
    private Environment environment;
    @Override
    protected void Sort(List<MonitorPointEntity> monitorPointEntityList){
        monitorPointEntityList.sort((a, b) -> Integer.parseInt(a.getId()) - Integer.parseInt(b.getId()));
    }
    @Override
    protected MonitorPointEntity getEntityByXmlFile(Document document, int i) {
        MonitorPointEntity monitorPointEntity = new MonitorPointEntity();
        String id = document.getElementsByTagName("S_ID").item(i).getFirstChild().getNodeValue();
        String linename = document.getElementsByTagName("S_LINENAME").item(i).getFirstChild().getNodeValue();
        String linecode = document.getElementsByTagName("S_LINECODE").item(i).getFirstChild().getNodeValue();
        String basestationcode = document.getElementsByTagName("S_BASESTATIONCODE").item(i).getFirstChild().getNodeValue();
        int sensortype = Integer.parseInt(document.getElementsByTagName("S_SENSORTYPE").item(i).getFirstChild().getNodeValue());
        int km = Integer.parseInt(document.getElementsByTagName("I_KM").item(i).getFirstChild().getNodeValue());
        int meter = Integer.parseInt(document.getElementsByTagName("I_METER").item(i).getFirstChild().getNodeValue());
        int sortid = Integer.parseInt(document.getElementsByTagName("I_SORTID").item(i).getFirstChild().getNodeValue());
        int ableflag = Integer.parseInt(document.getElementsByTagName("C_ABLEFLAG").item(i).getFirstChild().getNodeValue());
//        String monitorpointname = document.getElementsByTagName("S_MONITORPOINTNAME").item(i).getFirstChild().getNodeValue();
//        String kilometer = document.getElementsByTagName("KILOMETER").item(i).getFirstChild().getNodeValue();
        monitorPointEntity.setId(id);
        monitorPointEntity.setLineName(linename);
        monitorPointEntity.setLineCode(linecode);
        monitorPointEntity.setBaseStationCode(basestationcode);
        monitorPointEntity.setSensorType(sensortype);
        monitorPointEntity.setKm(km);
        monitorPointEntity.setMeter(meter);
        monitorPointEntity.setSortId(sortid);
        monitorPointEntity.setAbleFlag(ableflag);
        return monitorPointEntity;
    }

    @Override
    public String getFilePath() {
        return environment.getProperty("monitorpointpath");
    }

    @Override
    public boolean updateXML(MonitorPointEntity newEntity,MonitorPointEntity originalEntity,Document document,int i){
        document.getElementsByTagName("S_LINENAME").item(i).getFirstChild().setNodeValue(newEntity.getLineName());
        document.getElementsByTagName("S_LINECODE").item(i).getFirstChild().setNodeValue(newEntity.getLineCode());
        document.getElementsByTagName("S_BASESTATIONCODE").item(i).getFirstChild().setNodeValue(newEntity.getBaseStationCode());
        document.getElementsByTagName("S_SENSORTYPE").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getSensorType()));
        document.getElementsByTagName("I_KM").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getKm()));
        document.getElementsByTagName("I_METER").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getMeter()));
        document.getElementsByTagName("I_SORTID").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getSortId()));
        document.getElementsByTagName("C_ABLEFLAG").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getAbleFlag()));
        saveXML(document, getFilePath());
        return true;
    }

    @Override
    public boolean addXML(MonitorPointEntity newEntity,Document document){
        Element eltTable = document.createElement("Table");
        Element eltId = document.createElement("S_ID");
        Element eltLineName = document.createElement("S_LINENAME");
        Element eltLineCode = document.createElement("S_LINECODE");
        Element eltBaseStationCode = document.createElement("S_BASESTATIONCODE");
        Element eltSensorType = document.createElement("S_SENSORTYPE");
        Element eltKm = document.createElement("I_KM");
        Element eltMeter = document.createElement("I_METER");
        Element eltSortId = document.createElement("I_SORTID");
        Element eltAbleFlag = document.createElement("C_ABLEFLAG");

        eltId.appendChild(document.createTextNode(newEntity.getId()));
        eltLineName.appendChild(document.createTextNode(newEntity.getLineName()));
        eltLineCode.appendChild(document.createTextNode(newEntity.getLineCode()));
        eltBaseStationCode.appendChild(document.createTextNode(newEntity.getBaseStationCode()));
        eltSensorType.appendChild(document.createTextNode(Integer.toString(newEntity.getSensorType())));
        eltKm.appendChild(document.createTextNode(Integer.toString(newEntity.getKm())));
        eltMeter.appendChild(document.createTextNode(Integer.toString(newEntity.getMeter())));
        eltSortId.appendChild(document.createTextNode(Integer.toString(newEntity.getSortId())));
        eltAbleFlag.appendChild(document.createTextNode(Integer.toString(newEntity.getAbleFlag())));

        eltTable.appendChild(eltId);
        eltTable.appendChild(eltLineName);
        eltTable.appendChild(eltLineCode);
        eltTable.appendChild(eltBaseStationCode);
        eltTable.appendChild(eltSensorType);
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
    protected boolean isExist(MonitorPointEntity monitorPointEntity,String id){
        try {
            if (monitorPointEntity.getId().equals(id)) {
                return true;
            }
            else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    protected boolean isExist(MonitorPointEntity monitorPointEntity, MonitorPointEntity monitorPointEntity1){
        if (monitorPointEntity.getId().equals(monitorPointEntity1.getId())) {
            return true;
        }
        else {
            return false;
        }
    }

    public List<MonitorPointEntity> findMonitorPointEntitiesBySensorType(int sensorType, Sort sort){
        List<MonitorPointEntity> monitorPointEntityList=findAll();
        monitorPointEntityList= monitorPointEntityList.stream().filter(x-> x.getSensorType()==sensorType).collect(Collectors.toList());
        return monitorPointEntityList;
    }
}
