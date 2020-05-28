package com.bjjw.dmsmaintenanceservice.serviceimpl;

import com.bjjw.dmsmaintenanceservice.entity.SnowBenchMarkEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.List;

@Service
public class SnowBenchMarkXmlServiceImpl extends XmlServiceImpl<SnowBenchMarkEntity>{
    @Autowired
    private Environment environment;
    @Override
    protected void Sort(List<SnowBenchMarkEntity> snowBenchMarkEntityList){
        snowBenchMarkEntityList.sort((a, b) -> Integer.parseInt(a.getId()) - Integer.parseInt(b.getId()));
    }
    @Override
    protected SnowBenchMarkEntity getEntityByXmlFile(Document document, int i) {
        SnowBenchMarkEntity snowBenchMarkEntity = new SnowBenchMarkEntity();
        String id = document.getElementsByTagName("S_ID").item(i).getFirstChild().getNodeValue();
        String linename = document.getElementsByTagName("S_LINENAME").item(i).getFirstChild().getNodeValue();
        String linecode = document.getElementsByTagName("S_LINECODE").item(i).getFirstChild().getNodeValue();
        String monitoringunitcode = document.getElementsByTagName("S_MONITORINGUNITCODE").item(i).getFirstChild().getNodeValue();
        String monitoringpointcode = document.getElementsByTagName("S_MONITORINGPOINTCODE").item(i).getFirstChild().getNodeValue();
        String type = document.getElementsByTagName("S_DTYPE").item(i).getFirstChild().getNodeValue();
        int snowdepthbenchmark = Integer.parseInt(document.getElementsByTagName("I_SNOWDEPTHBENCHMARK").item(i).getFirstChild().getNodeValue());
        int km = Integer.parseInt(document.getElementsByTagName("I_KM").item(i).getFirstChild().getNodeValue());
        int meter = Integer.parseInt(document.getElementsByTagName("I_METER").item(i).getFirstChild().getNodeValue());
        String railwayadministrator = document.getElementsByTagName("S_RAILWAYADMINISTRATOR").item(i).getFirstChild().getNodeValue();
        snowBenchMarkEntity.setId(id);
        snowBenchMarkEntity.setLineName(linename);
        snowBenchMarkEntity.setLineCode(linecode);
        snowBenchMarkEntity.setMonitorUnitCode(monitoringunitcode);
        snowBenchMarkEntity.setMonitorPointCode(monitoringpointcode);
        snowBenchMarkEntity.setDtype(type);
        snowBenchMarkEntity.setSnowBenchMark(snowdepthbenchmark);
        snowBenchMarkEntity.setKm(km);
        snowBenchMarkEntity.setMeter(meter);
        snowBenchMarkEntity.setRailwayAdministrator(railwayadministrator);
        return snowBenchMarkEntity;
    }

    @Override
    public String getFilePath() {
        return environment.getProperty("snowbenchmarkpath");
    }

    @Override
    public boolean updateXML(SnowBenchMarkEntity newEntity,SnowBenchMarkEntity originalEntity,Document document,int i){
        document.getElementsByTagName("S_LINENAME").item(i).getFirstChild().setNodeValue(newEntity.getLineName());
        document.getElementsByTagName("S_LINECODE").item(i).getFirstChild().setNodeValue(newEntity.getLineCode());
        document.getElementsByTagName("S_MONITORINGUNITCODE").item(i).getFirstChild().setNodeValue(newEntity.getMonitorUnitCode());
        document.getElementsByTagName("S_MONITORINGPOINTCODE").item(i).getFirstChild().setNodeValue(newEntity.getMonitorPointCode());
        document.getElementsByTagName("S_DTYPE").item(i).getFirstChild().setNodeValue(newEntity.getDtype());
        document.getElementsByTagName("I_SNOWDEPTHBENCHMARK").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getSnowBenchMark()));
        document.getElementsByTagName("I_KM").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getKm()));
        document.getElementsByTagName("I_METER").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getMeter()));
        document.getElementsByTagName("S_RAILWAYADMINISTRATOR").item(i).getFirstChild().setNodeValue(newEntity.getRailwayAdministrator());
        saveXML(document, getFilePath());
        return true;
    }

    @Override
    public boolean addXML(SnowBenchMarkEntity newEntity,Document document){
        Element eltTable = document.createElement("Table");
        Element eltId = document.createElement("S_ID");
        Element eltLineName = document.createElement("S_LINENAME");
        Element eltLineCode = document.createElement("S_LINECODE");
        Element eltMonitorUnitCode = document.createElement("S_MONITORINGUNITCODE");
        Element eltMonitorPointCode = document.createElement("S_MONITORINGPOINTCODE");
        Element eltDtype = document.createElement("S_DTYPE");
        Element eltSnowDepthBenchMark = document.createElement("I_SNOWDEPTHBENCHMARK");
        Element eltKm = document.createElement("I_KM");
        Element eltMeter = document.createElement("I_METER");
        Element eltRailwayAdministrator = document.createElement("S_RAILWAYADMINISTRATOR");

        eltId.appendChild(document.createTextNode(newEntity.getId()));
        eltLineName.appendChild(document.createTextNode(newEntity.getLineName()));
        eltLineCode.appendChild(document.createTextNode(newEntity.getLineCode()));
        eltMonitorUnitCode.appendChild(document.createTextNode(newEntity.getMonitorUnitCode()));
        eltMonitorPointCode.appendChild(document.createTextNode(newEntity.getMonitorPointCode()));
        eltDtype.appendChild(document.createTextNode(newEntity.getDtype()));
        eltSnowDepthBenchMark.appendChild(document.createTextNode(Integer.toString(newEntity.getSnowBenchMark())));
        eltKm.appendChild(document.createTextNode(Integer.toString(newEntity.getKm())));
        eltMeter.appendChild(document.createTextNode(Integer.toString(newEntity.getMeter())));
        eltRailwayAdministrator.appendChild(document.createTextNode(newEntity.getRailwayAdministrator()));
        eltTable.appendChild(eltId);
        eltTable.appendChild(eltLineName);
        eltTable.appendChild(eltLineCode);
        eltTable.appendChild(eltMonitorUnitCode);
        eltTable.appendChild(eltMonitorPointCode);
        eltTable.appendChild(eltDtype);
        eltTable.appendChild(eltSnowDepthBenchMark);
        eltTable.appendChild(eltKm);
        eltTable.appendChild(eltMeter);
        eltTable.appendChild(eltRailwayAdministrator);
        //获取根节点
        Element eltRoot = document.getDocumentElement();
        //把叶节点加入到根节点下
        eltRoot.appendChild(eltTable);
        //更新修改后的源文件
        saveXML(document, getFilePath());
        return true;
    }
    @Override
    protected boolean isExist(SnowBenchMarkEntity snowBenchMarkEntity, String id){
        if (snowBenchMarkEntity.getId().equals(id)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    protected boolean isExist(SnowBenchMarkEntity snowBenchMarkEntity,SnowBenchMarkEntity baseStationEntity1){
        if (snowBenchMarkEntity.getId().equals(baseStationEntity1.getId())) {
            return true;
        }
        else {
            return false;
        }
    }
}
