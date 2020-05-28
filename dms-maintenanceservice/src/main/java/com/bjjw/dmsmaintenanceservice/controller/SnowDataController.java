package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.entity.SnowDataEntity;
import com.bjjw.dmsmaintenanceservice.entity.SnowSensorStatusEntity;
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
@RequestMapping("snowdata")
public class SnowDataController extends BaseController {
    @Autowired
    CommonMethods commonMethods;
    @PostMapping("sendSnowData")
    public boolean sendRainData(@RequestBody SnowDataEntity snowDataEntity){
        AccessBusWCF client = commonMethods.getWebServiceClient();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String bureaCode=client.getBasicHttpBindingIAccessBusWCF().gGetBureaCode();
        String lineCode=client.getBasicHttpBindingIAccessBusWCF().gGetLineCode();
        String snowDataStr = String.format("%s#%s#%s#%s#%s",
                bureaCode,
                lineCode, snowDataEntity.getMonitorPointCode(),
                snowDataEntity.getActualSnowDepth(),df.format(new Date()));
        client.getBasicHttpBindingIAccessBusWCF().aHandlSnowData("gate_0",snowDataStr);
        return true;
    }

    @PostMapping("sendSnowDevice")
    public boolean sendSnowDevice(@RequestBody SnowSensorStatusEntity snowSensorStatusEntity){
        AccessBusWCF client = commonMethods.getWebServiceClient();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String bureaCode=client.getBasicHttpBindingIAccessBusWCF().gGetBureaCode();
        String lineCode=client.getBasicHttpBindingIAccessBusWCF().gGetLineCode();
        String snowDeviceStr = String.format("%s#%s#%s#%s#%s#%s",
                bureaCode,
                lineCode, snowSensorStatusEntity.getMonitorPointCode(),
                snowSensorStatusEntity.getSnowSensorCommStatus(),snowSensorStatusEntity.getSnowSensorDeviceStatus(),df.format(new Date()));
        client.getBasicHttpBindingIAccessBusWCF().dHandleSnowSensorStatus("gate_0",snowDeviceStr);
        return true;
    }
}
