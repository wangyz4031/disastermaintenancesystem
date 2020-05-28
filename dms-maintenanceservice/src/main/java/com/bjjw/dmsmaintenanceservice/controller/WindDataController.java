package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.entity.WindDataEntity;
import com.bjjw.dmsmaintenanceservice.entity.WindSensorStatusEntity;
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
@RequestMapping("winddata")
public class WindDataController extends BaseController {
    @Autowired
    CommonMethods commonMethods;
    @PostMapping("sendWindData")
    public boolean sendWindData(@RequestBody WindDataEntity windDataEntity){
        AccessBusWCF client = commonMethods.getWebServiceClient();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String bureaCode=client.getBasicHttpBindingIAccessBusWCF().gGetBureaCode();
        String lineCode=client.getBasicHttpBindingIAccessBusWCF().gGetLineCode();
        String windDataStr = String.format("%s#%s#%s#%s#%s#%s#%s#%s",
                bureaCode,
                lineCode, windDataEntity.getMonitorPointCode(),
                windDataEntity.getWindSpeed1(),windDataEntity.getWindDirection1(),windDataEntity.getWindSpeed2(),
                windDataEntity.getWindDirection2(),df.format(new Date()));
        client.getBasicHttpBindingIAccessBusWCF().aHandleWindData("gate_0",windDataStr);
        return true;
    }

    @PostMapping("sendWindDevice")
    public boolean sendWindDevice(@RequestBody WindSensorStatusEntity windSensorStatusEntity){
        AccessBusWCF client = commonMethods.getWebServiceClient();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String bureaCode=client.getBasicHttpBindingIAccessBusWCF().gGetBureaCode();
        String lineCode=client.getBasicHttpBindingIAccessBusWCF().gGetLineCode();
        String windDeviceStr = String.format("%s#%s#%s#%s#%s#%s#%s#%s",
                bureaCode,
                lineCode, windSensorStatusEntity.getMonitorPointCode(),
                windSensorStatusEntity.getWindSensor1CommStatus(),windSensorStatusEntity.getWindSensor1DeviceStatus(),
                windSensorStatusEntity.getWindSensor2CommStatus(),
                windSensorStatusEntity.getWindSensor2DeviceStatus(),df.format(new Date()));
        client.getBasicHttpBindingIAccessBusWCF().dHandleWindSensorStatus("gate_0",windDeviceStr);
        return true;
    }
}
