package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.entity.ForeignMatterRelayStatusEntity;
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
@RequestMapping("foreignmatterdata")
public class ForeignMatterDataController extends BaseController {
    @Autowired
    CommonMethods commonMethods;
    @PostMapping("sendForeignMatterData")
    public boolean sendForeignMatterData(@RequestBody ForeignMatterRelayStatusEntity foreignMatterRelayStatusEntity){
        AccessBusWCF client = commonMethods.getWebServiceClient();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String bureaCode=client.getBasicHttpBindingIAccessBusWCF().gGetBureaCode();
        String lineCode=client.getBasicHttpBindingIAccessBusWCF().gGetLineCode();
        String foreignMatterDataStr = String.format("%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s#%s",
                bureaCode,
                lineCode, foreignMatterRelayStatusEntity.getMonitorPointCode(),
                foreignMatterRelayStatusEntity.getElectricGrid1RelayStatus(), foreignMatterRelayStatusEntity.getElectricGrid2RelayStatus(),
                foreignMatterRelayStatusEntity.getUpTemporaryDriveRelayStatus(), foreignMatterRelayStatusEntity.getDownTemporaryDriveRelayStatus(),
                foreignMatterRelayStatusEntity.getRemoteResumeRelayStatus(), foreignMatterRelayStatusEntity.getControlResumeRelayStatus(),
                foreignMatterRelayStatusEntity.getElectricGrid1RemoteTestRelayStatus(),
                foreignMatterRelayStatusEntity.getElectricGrid2RemoteTestRelayStatus(),
                foreignMatterRelayStatusEntity.getUpTrainControlRelayStatus(),foreignMatterRelayStatusEntity.getDownTrainControlRelayStatus(),
                foreignMatterRelayStatusEntity.getAlarmRelayStatus(),
                df.format(new Date()));
        client.getBasicHttpBindingIAccessBusWCF().dHandleForeignMatterRelayStatus("gate_0",foreignMatterDataStr);
        return true;
    }
}
