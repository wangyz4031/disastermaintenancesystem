package com.bjjw.dmsmaintenanceservice.serviceimpl;

import com.bjjw.dmsmaintenanceservice.entity.ProcessSegmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.List;

@Service
public class ProcessSegmentXmlServiceImpl extends XmlServiceImpl<ProcessSegmentEntity>{
    @Autowired
    private Environment environment;
    @Override
    protected void Sort(List<ProcessSegmentEntity> processSegmentEntityList){
        processSegmentEntityList.sort((a, b) -> Integer.parseInt(a.getMonitorPointCode()) - Integer.parseInt(b.getMonitorPointCode()));
    }
    @Override
    protected ProcessSegmentEntity getEntityByXmlFile(Document document, int i) {
        ProcessSegmentEntity processSegmentEntity = new ProcessSegmentEntity();
        String id = document.getElementsByTagName("S_ID").item(i).getFirstChild().getNodeValue();
        String linename = document.getElementsByTagName("S_LINENAME").item(i).getFirstChild().getNodeValue();
        String linecode = document.getElementsByTagName("S_LINECODE").item(i).getFirstChild().getNodeValue();
        String bureacode = document.getElementsByTagName("S_BUREACODE").item(i).getFirstChild().getNodeValue();
        String monitoringunitcode = document.getElementsByTagName("S_MONITORINGUNITCODE").item(i).getFirstChild().getNodeValue();
        String monitoringpointcode = document.getElementsByTagName("S_MONITORINGPOINTCODE").item(i).getFirstChild().getNodeValue();
        String areacode = document.getElementsByTagName("S_AREACODE").item(i).getFirstChild().getNodeValue();
        String areaname = document.getElementsByTagName("S_AREANAME").item(i).getFirstChild().getNodeValue();
        int startkilometer = Integer.parseInt(document.getElementsByTagName("I_STARTKILOMETER").item(i).getFirstChild().getNodeValue());
        int startmeter = Integer.parseInt(document.getElementsByTagName("I_STARTMETER").item(i).getFirstChild().getNodeValue());
        int endkilometer = Integer.parseInt(document.getElementsByTagName("I_ENDKILOMETER").item(i).getFirstChild().getNodeValue());
        int endmeter = Integer.parseInt(document.getElementsByTagName("I_ENDMETER").item(i).getFirstChild().getNodeValue());
        int divid = Integer.parseInt(document.getElementsByTagName("I_DIVID").item(i).getFirstChild().getNodeValue());
        processSegmentEntity.setId(id);
        processSegmentEntity.setLineName(linename);
        processSegmentEntity.setLineCode(linecode);
        processSegmentEntity.setBureaCode(bureacode);
        processSegmentEntity.setMonitorUnitCode(monitoringunitcode);
        processSegmentEntity.setMonitorPointCode(monitoringpointcode);
        processSegmentEntity.setAreaCode(areacode);
        processSegmentEntity.setAreaName(areaname);
        processSegmentEntity.setStartSegmentKm(startkilometer);
        processSegmentEntity.setStartSegmentMeter(startmeter);
        processSegmentEntity.setEndSegmentKm(endkilometer);
        processSegmentEntity.setEndSegmentMeter(endmeter);
        processSegmentEntity.setDivId(divid);
        return processSegmentEntity;
    }

    @Override
    public String getFilePath() {
        return environment.getProperty("processsegmentpath");
    }

    @Override
    public boolean updateXML(ProcessSegmentEntity newEntity,ProcessSegmentEntity originalEntity,Document document,int i){
        document.getElementsByTagName("S_LINENAME").item(i).getFirstChild().setNodeValue(newEntity.getLineName());
        document.getElementsByTagName("S_LINECODE").item(i).getFirstChild().setNodeValue(newEntity.getLineCode());
        document.getElementsByTagName("S_BUREACODE").item(i).getFirstChild().setNodeValue(newEntity.getBureaCode());
        document.getElementsByTagName("S_MONITORINGUNITCODE").item(i).getFirstChild().setNodeValue(newEntity.getMonitorUnitCode());
        document.getElementsByTagName("S_MONITORINGPOINTCODE").item(i).getFirstChild().setNodeValue(newEntity.getMonitorPointCode());
        document.getElementsByTagName("S_AREACODE").item(i).getFirstChild().setNodeValue(newEntity.getAreaCode());
        document.getElementsByTagName("S_AREANAME").item(i).getFirstChild().setNodeValue(newEntity.getAreaName());
        document.getElementsByTagName("I_STARTKILOMETER").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getStartSegmentMeter()));
        document.getElementsByTagName("I_STARTMETER").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getStartSegmentMeter()));
        document.getElementsByTagName("I_ENDKILOMETER").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getEndSegmentKm()));
        document.getElementsByTagName("I_ENDMETER").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getEndSegmentMeter()));
        document.getElementsByTagName("I_DIVID").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getDivId()));
        saveXML(document, getFilePath());
        return true;
    }

    @Override
    public boolean addXML(ProcessSegmentEntity newEntity,Document document){
        Element eltTable = document.createElement("Table");
        Element eltId = document.createElement("S_ID");
        Element eltLineName = document.createElement("S_LINENAME");
        Element eltLineCode = document.createElement("S_LINECODE");
        Element eltBureaCode = document.createElement("S_BUREACODE");
        Element eltMonitorUnitCode = document.createElement("S_MONITORINGUNITCODE");
        Element eltMonitorPointCode = document.createElement("S_MONITORINGPOINTCODE");
        Element eltAreaCode= document.createElement("S_AREACODE");
        Element eltAreaName= document.createElement("S_AREANAME");
        Element eltStartKiloMeter = document.createElement("I_STARTKILOMETER");
        Element eltStartMeter = document.createElement("I_STARTMETER");
        Element eltEndKiloMeter = document.createElement("I_ENDKILOMETER");
        Element eltEndMeter = document.createElement("I_ENDMETER");
        Element eltDivid = document.createElement("I_DIVID");
        eltId.appendChild(document.createTextNode(newEntity.getId()));
        eltLineName.appendChild(document.createTextNode(newEntity.getLineName()));
        eltLineCode.appendChild(document.createTextNode(newEntity.getLineCode()));
        eltBureaCode.appendChild(document.createTextNode(newEntity.getBureaCode()));
        eltMonitorUnitCode.appendChild(document.createTextNode(newEntity.getMonitorUnitCode()));
        eltMonitorPointCode.appendChild(document.createTextNode(newEntity.getMonitorPointCode()));
        eltAreaCode.appendChild(document.createTextNode(newEntity.getAreaCode()));
        eltAreaName.appendChild(document.createTextNode(newEntity.getAreaName()));
        eltStartKiloMeter.appendChild(document.createTextNode(Integer.toString(newEntity.getStartSegmentKm())));
        eltStartMeter.appendChild(document.createTextNode(Integer.toString(newEntity.getStartSegmentMeter())));
        eltEndKiloMeter.appendChild(document.createTextNode(Integer.toString(newEntity.getEndSegmentKm())));
        eltEndMeter.appendChild(document.createTextNode(Integer.toString(newEntity.getEndSegmentMeter())));
        eltDivid.appendChild(document.createTextNode(Integer.toString(newEntity.getDivId())));
        eltTable.appendChild(eltId);
        eltTable.appendChild(eltLineName);
        eltTable.appendChild(eltLineCode);
        eltTable.appendChild(eltBureaCode);
        eltTable.appendChild(eltMonitorUnitCode);
        eltTable.appendChild(eltMonitorPointCode);
        eltTable.appendChild(eltAreaCode);
        eltTable.appendChild(eltAreaName);
        eltTable.appendChild(eltStartKiloMeter);
        eltTable.appendChild(eltStartMeter);
        eltTable.appendChild(eltEndKiloMeter);
        eltTable.appendChild(eltEndMeter);
        eltTable.appendChild(eltDivid);
        //获取根节点
        Element eltRoot = document.getDocumentElement();
        //把叶节点加入到根节点下
        eltRoot.appendChild(eltTable);
        //更新修改后的源文件
        saveXML(document, getFilePath());
        return true;
    }
    @Override
    protected boolean isExist(ProcessSegmentEntity processSegmentEntity, String id){
        if (processSegmentEntity.getId().equals(id)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    protected boolean isExist(ProcessSegmentEntity processSegmentEntity,ProcessSegmentEntity processSegmentEntity1){
        if (processSegmentEntity.getId().equals(processSegmentEntity1.getId())) {
            return true;
        }
        else {
            return false;
        }
    }
}
