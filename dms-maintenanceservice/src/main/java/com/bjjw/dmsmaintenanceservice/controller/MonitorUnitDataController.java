package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.entity.MonitorUnitStatusEntity;
import com.bjjw.dmsmaintenanceservice.webservice.AccessBusWCF;
import com.bjjw.dmsmaintenanceservice.webservice.CommonMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("monitorunitdata")
public class MonitorUnitDataController extends BaseController {
    @Autowired
    CommonMethods commonMethods;
    @PostMapping("sendMonitorUnitData")
    public boolean sendMonitorUnitData(@RequestBody MonitorUnitStatusEntity monitorUnitStatusEntity){
        AccessBusWCF client = commonMethods.getWebServiceClient();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String bureaCode=client.getBasicHttpBindingIAccessBusWCF().gGetBureaCode();
        String lineCode=client.getBasicHttpBindingIAccessBusWCF().gGetLineCode();
        String monitorUnitDataStr = String.format("%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s",
                bureaCode,
                lineCode, monitorUnitStatusEntity.getMonitorUnitCode(),
                Integer.toString(monitorUnitStatusEntity.getControlModuleAHostStatus())+ Integer.toString(monitorUnitStatusEntity.getControlModuleAStatus())+ Integer.toString(monitorUnitStatusEntity.getControlModuleANetStatus()),
                Integer.toString(monitorUnitStatusEntity.getControlModuleBHostStatus())+ Integer.toString(monitorUnitStatusEntity.getControlModuleBStatus())+ Integer.toString(monitorUnitStatusEntity.getControlModuleBNetStatus()),
                monitorUnitStatusEntity.getBoardCardA1Status(), monitorUnitStatusEntity.getBoardCardA2Status(),
                monitorUnitStatusEntity.getBoardCardA3Status(), monitorUnitStatusEntity.getBoardCardA4Status(),
                monitorUnitStatusEntity.getBoardCardA5Status(), monitorUnitStatusEntity.getBoardCardB1Status(),
                monitorUnitStatusEntity.getBoardCardB2Status(),monitorUnitStatusEntity.getBoardCardB2Status(),
                monitorUnitStatusEntity.getBoardCardB3Status(),monitorUnitStatusEntity.getBoardCardB4Status(),
                monitorUnitStatusEntity.getBoardCardB5Status(),
                Integer.toString(monitorUnitStatusEntity.getUps1InputStatus())+ Integer.toString(monitorUnitStatusEntity.getUps1OutputStatus())+ Integer.toString(monitorUnitStatusEntity.getUps1NetStatus()),
                Integer.toString(monitorUnitStatusEntity.getUps2InputStatus())+ Integer.toString(monitorUnitStatusEntity.getUps2OutputStatus())+ Integer.toString(monitorUnitStatusEntity.getUps2NetStatus()),
                monitorUnitStatusEntity.getUps1InputVoltage(),monitorUnitStatusEntity.getUps1OutputVoltage(),
                monitorUnitStatusEntity.getUps2InputVoltage(),monitorUnitStatusEntity.getUps2OutputVoltage(),
                22,23,24,25,26,27,28,29,30,31,32,33,
                monitorUnitStatusEntity.getUps1DumpEnergy(),monitorUnitStatusEntity.getUps2DumpEnergy(),
                df.format(new Date()));
        client.getBasicHttpBindingIAccessBusWCF().dHandleMonitorUnitDeviceStatus("gate_0",monitorUnitDataStr);
        return true;
    }
}
