package com.bjjw.dmsmaintenanceservice.serviceimpl;

import com.bjjw.dmsmaintenanceservice.entity.LineRuleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.List;

@Service
public class LineRuleXmlServiceImpl extends XmlServiceImpl<LineRuleEntity>{
    @Autowired
    private Environment environment;
    @Override
    protected void Sort(List<LineRuleEntity> lineRuleEntityList){
        lineRuleEntityList.sort((a, b) -> Integer.parseInt(a.getMonitorPointCode()) - Integer.parseInt(b.getMonitorPointCode()));
    }

    @Override
    protected LineRuleEntity getEntityByXmlFile(Document document, int i) {
        LineRuleEntity lineRuleEntity = new LineRuleEntity();
        String monitoringpointcode = document.getElementsByTagName("S_MONITORINGPOINTCODE").item(i).getFirstChild().getNodeValue();
        String id = document.getElementsByTagName("S_ID").item(i).getFirstChild().getNodeValue();
        String linename = document.getElementsByTagName("S_LINENAME").item(i).getFirstChild().getNodeValue();
        String linecode = document.getElementsByTagName("S_LINECODE").item(i).getFirstChild().getNodeValue();
        String bureacode = document.getElementsByTagName("S_BUREACODE").item(i).getFirstChild().getNodeValue();
        String startvalue = document.getElementsByTagName("S_STARTVALUE").item(i).getFirstChild().getNodeValue();
        String endvalue = "";
        NodeList nodeList=document.getElementsByTagName("S_STARTVALUE").item(i).getParentNode().getChildNodes();
        Node node = getNodeByPropertyName(nodeList,"S_ENDVALUE");
        if(node != null){
            endvalue = node.getFirstChild().getNodeValue();
        }
        int ableflag = Integer.parseInt(document.getElementsByTagName("C_ABLEFLAG").item(i).getFirstChild().getNodeValue());
        String type = document.getElementsByTagName("S_TYPE").item(i).getFirstChild().getNodeValue();
//        int unittype = Integer.parseInt(document.getElementsByTagName("S_UNITTYPE").item(i).getFirstChild().getNodeValue());
        String startsign = document.getElementsByTagName("S_STARTSIGN").item(i).getFirstChild().getNodeValue();
        String endsign = document.getElementsByTagName("S_ENDSIGN").item(i).getFirstChild().getNodeValue();
        String subtype = document.getElementsByTagName("S_SUBTYPE").item(i).getFirstChild().getNodeValue();
        String group = document.getElementsByTagName("S_GROUP").item(i).getFirstChild().getNodeValue();
        String modename = document.getElementsByTagName("S_MODENAME").item(i).getFirstChild().getNodeValue();
        int level = Integer.parseInt(document.getElementsByTagName("C_LEVEL").item(i).getFirstChild().getNodeValue());
        int speed = Integer.parseInt(document.getElementsByTagName("I_SPEED").item(i).getFirstChild().getNodeValue());
        String desc = document.getElementsByTagName("S_DESC").item(i).getFirstChild().getNodeValue();
        String alarmtypecode = document.getElementsByTagName("S_ALARMTYPECODE").item(i).getFirstChild().getNodeValue();
        String alarmtypename = document.getElementsByTagName("S_ALARMTYPENAME").item(i).getFirstChild().getNodeValue();
        lineRuleEntity.setId(id);
        lineRuleEntity.setLineName(linename);
        lineRuleEntity.setLineCode(linecode);
        lineRuleEntity.setBureaCode(bureacode);
        lineRuleEntity.setStartValue(startvalue);
        lineRuleEntity.setEndValue(endvalue);
        lineRuleEntity.setAbleFlag(ableflag);
        lineRuleEntity.setType(type);
        lineRuleEntity.setStartSign(startsign);
        lineRuleEntity.setEndSign(endsign);
        lineRuleEntity.setSubType(subtype);
        lineRuleEntity.setGroup(group);
        lineRuleEntity.setModeName(modename);
        lineRuleEntity.setLevel(level);
        lineRuleEntity.setLimitSpeed(speed);
        lineRuleEntity.setDesc(desc);
        lineRuleEntity.setAlarmTypeCode(alarmtypecode);
        lineRuleEntity.setAlarmTypeName(alarmtypename);
        lineRuleEntity.setMonitorPointCode(monitoringpointcode);
        return lineRuleEntity;
    }

    @Override
    public String getFilePath() {
        return  environment.getProperty("linerulepath");
    }

    @Override
    public boolean updateXML(LineRuleEntity newEntity,LineRuleEntity originalEntity,Document document,int i){
        document.getElementsByTagName("S_MONITORINGPOINTCODE").item(i).getFirstChild().setNodeValue(newEntity.getMonitorPointCode());
        document.getElementsByTagName("S_LINENAME").item(i).getFirstChild().setNodeValue(newEntity.getLineName());
        document.getElementsByTagName("S_LINECODE").item(i).getFirstChild().setNodeValue(newEntity.getLineCode());
        document.getElementsByTagName("S_BUREACODE").item(i).getFirstChild().setNodeValue(newEntity.getBureaCode());
        document.getElementsByTagName("S_STARTVALUE").item(i).getFirstChild().setNodeValue(newEntity.getStartValue());

        NodeList nodeList=document.getElementsByTagName("S_STARTVALUE").item(i).getParentNode().getChildNodes();

        if(newEntity.getEndValue().equals("")){
            Node node = getNodeByPropertyName(nodeList,"S_ENDVALUE");
            if(node != null){
                document.getElementsByTagName("S_STARTVALUE").item(i).getParentNode().removeChild(node);
            }
        }
        else {
            Node node = getNodeByPropertyName(nodeList,"S_ENDVALUE");
            if(node == null){
                Element eltEndValue= document.createElement("S_ENDVALUE");
                eltEndValue.appendChild(document.createTextNode(newEntity.getEndValue()));
                document.getElementsByTagName("S_STARTVALUE").item(i).getParentNode().appendChild(eltEndValue);
            }
            else {
                node.getFirstChild().setNodeValue(newEntity.getEndValue());
            }
        }
        document.getElementsByTagName("C_ABLEFLAG").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getAbleFlag()));
        document.getElementsByTagName("S_TYPE").item(i).getFirstChild().setNodeValue(newEntity.getType());
        document.getElementsByTagName("S_STARTSIGN").item(i).getFirstChild().setNodeValue(newEntity.getStartSign());
        document.getElementsByTagName("S_ENDSIGN").item(i).getFirstChild().setNodeValue(newEntity.getEndSign());
        document.getElementsByTagName("S_SUBTYPE").item(i).getFirstChild().setNodeValue(newEntity.getSubType());
        document.getElementsByTagName("S_GROUP").item(i).getFirstChild().setNodeValue(newEntity.getGroup());
        document.getElementsByTagName("S_MODENAME").item(i).getFirstChild().setNodeValue(newEntity.getModeName());
        document.getElementsByTagName("C_LEVEL").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getLevel()));
        document.getElementsByTagName("I_SPEED").item(i).getFirstChild().setNodeValue(Integer.toString(newEntity.getLimitSpeed()));
        document.getElementsByTagName("S_DESC").item(i).getFirstChild().setNodeValue(newEntity.getDesc());
        document.getElementsByTagName("S_ALARMTYPECODE").item(i).getFirstChild().setNodeValue(newEntity.getAlarmTypeCode());
        document.getElementsByTagName("S_ALARMTYPENAME").item(i).getFirstChild().setNodeValue(newEntity.getAlarmTypeName());
        saveXML(document, getFilePath());
        return true;
    }

    @Override
    public boolean addXML(LineRuleEntity newEntity,Document document){
        Element eltTable = document.createElement("Table");
        Element eltId = document.createElement("S_ID");
        Element eltMonitorPointCode = document.createElement("S_MONITORINGPOINTCODE");
        Element eltLineName = document.createElement("S_LINENAME");
        Element eltLineCode = document.createElement("S_LINECODE");
        Element eltBureaCode = document.createElement("S_BUREACODE");
        Element eltStartValue = document.createElement("S_STARTVALUE");
        Element eltAbleFlag= document.createElement("C_ABLEFLAG");
        Element eltType = document.createElement("S_TYPE");
        Element eltStartSign = document.createElement("S_STARTSIGN");
        Element eltEndSign = document.createElement("S_ENDSIGN");
        Element eltSubType = document.createElement("S_SUBTYPE");
        Element eltGroup = document.createElement("S_GROUP");
        Element eltModeName = document.createElement("S_MODENAME");
        Element eltLevel = document.createElement("C_LEVEL");
        Element eltSpeed = document.createElement("I_SPEED");
        Element eltDesc = document.createElement("S_DESC");
        Element eltAlarmTypeCode = document.createElement("S_ALARMTYPECODE");
        Element eltAlarmTypeName = document.createElement("S_ALARMTYPENAME");

        eltId.appendChild(document.createTextNode(newEntity.getId()));
        eltMonitorPointCode.appendChild(document.createTextNode(newEntity.getMonitorPointCode()));
        eltLineName.appendChild(document.createTextNode(newEntity.getLineName()));
        eltLineCode.appendChild(document.createTextNode(newEntity.getLineCode()));
        eltBureaCode.appendChild(document.createTextNode(newEntity.getBureaCode()));
        eltStartValue.appendChild(document.createTextNode(newEntity.getStartValue()));

        eltAbleFlag.appendChild(document.createTextNode(Integer.toString(newEntity.getAbleFlag())));
        eltType.appendChild(document.createTextNode(newEntity.getType()));
        eltStartSign.appendChild(document.createTextNode(newEntity.getStartSign()));
        eltEndSign.appendChild(document.createTextNode(newEntity.getEndSign()));
        eltSubType.appendChild(document.createTextNode(newEntity.getSubType()));
        eltGroup.appendChild(document.createTextNode(newEntity.getGroup()));
        eltModeName.appendChild(document.createTextNode(newEntity.getModeName()));
        eltLevel.appendChild(document.createTextNode(Integer.toString(newEntity.getLevel())));
        eltSpeed.appendChild(document.createTextNode(Integer.toString(newEntity.getLimitSpeed())));
        eltDesc.appendChild(document.createTextNode(newEntity.getDesc()));
        eltAlarmTypeCode.appendChild(document.createTextNode(newEntity.getAlarmTypeCode()));
        eltAlarmTypeName.appendChild(document.createTextNode(newEntity.getAlarmTypeName()));
        eltTable.appendChild(eltId);
        eltTable.appendChild(eltMonitorPointCode);
        eltTable.appendChild(eltLineName);
        eltTable.appendChild(eltLineCode);
        eltTable.appendChild(eltBureaCode);
        eltTable.appendChild(eltStartValue);
        if(!newEntity.getEndValue().equals("")){
            Element eltEndValue= document.createElement("S_ENDVALUE");
            eltEndValue.appendChild(document.createTextNode(newEntity.getEndValue()));
            eltTable.appendChild(eltEndValue);
        }
        eltTable.appendChild(eltAbleFlag);
        eltTable.appendChild(eltType);
        eltTable.appendChild(eltStartSign);
        eltTable.appendChild(eltEndSign);
        eltTable.appendChild(eltSubType);
        eltTable.appendChild(eltGroup);
        eltTable.appendChild(eltModeName);
        eltTable.appendChild(eltLevel);
        eltTable.appendChild(eltSpeed);
        eltTable.appendChild(eltDesc);
        eltTable.appendChild(eltAlarmTypeCode);
        eltTable.appendChild(eltAlarmTypeName);
        //获取根节点
        Element eltRoot = document.getDocumentElement();
        //把叶节点加入到根节点下
        eltRoot.appendChild(eltTable);
        //更新修改后的源文件
        saveXML(document, getFilePath());
        return true;
    }
    @Override
    protected boolean isExist(LineRuleEntity lineRuleEntity, String id){
        if (lineRuleEntity.getId().equals(id)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    protected boolean isExist(LineRuleEntity lineRuleEntity, LineRuleEntity lineRuleEntity1){
        if (lineRuleEntity.getId().equals(lineRuleEntity1.getId())) {
            return true;
        }
        else {
            return false;
        }
    }
}
