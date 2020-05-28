package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.entity.MonitorPointEntity;
import com.bjjw.dmsmaintenanceservice.entity.RainDataEntity;
import com.bjjw.dmsmaintenanceservice.entity.RainSensorStatusEntity;
import com.bjjw.dmsmaintenanceservice.service.BaseInfoService;
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
@RequestMapping("raindata")
public class RainDataController extends BaseController {
    @Autowired
    CommonMethods commonMethods;
    @PostMapping("sendRainData")
    public boolean sendRainData(@RequestBody RainDataEntity rainDataEntity){
        AccessBusWCF client = commonMethods.getWebServiceClient();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String bureaCode=client.getBasicHttpBindingIAccessBusWCF().gGetBureaCode();
        String lineCode=client.getBasicHttpBindingIAccessBusWCF().gGetLineCode();
        String rainDataStr = String.format("%s#%s#%s#%s#%s",
                bureaCode,
                lineCode, rainDataEntity.getMonitorPointCode(),
                rainDataEntity.getCumulativeRainfall(),df.format(new Date()));
        client.getBasicHttpBindingIAccessBusWCF().aHandleRainData("gate_0",rainDataStr);
        return true;
    }

    @PostMapping("sendRainDevice")
    public boolean sendRainDevice(@RequestBody RainSensorStatusEntity rainSensorStatusEntity){
        AccessBusWCF client = commonMethods.getWebServiceClient();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String bureaCode=client.getBasicHttpBindingIAccessBusWCF().gGetBureaCode();
        String lineCode=client.getBasicHttpBindingIAccessBusWCF().gGetLineCode();
        String rainDeviceStr = String.format("%s#%s#%s#%s#%s#%s",
                bureaCode,
                lineCode, rainSensorStatusEntity.getMonitorPointCode(),
                rainSensorStatusEntity.getRainSensorCommStatus(),rainSensorStatusEntity.getRainSensorDeviceStatus(),df.format(new Date()));
        client.getBasicHttpBindingIAccessBusWCF().dHandleRainSensorStatus("gate_0",rainDeviceStr);
        return true;
    }

    @PostMapping("sendSpecifiedRainData")
    public boolean sendSpecifiedRainData(@RequestBody RainDataEntity rainDataEntity){
        BaseInfoService monitorPointService = createSystemService("monitorPointDBService", "monitorPointXmlService");
        AccessBusWCF client = commonMethods.getWebServiceClient();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String bureaCode=client.getBasicHttpBindingIAccessBusWCF().gGetBureaCode();
        String lineCode=client.getBasicHttpBindingIAccessBusWCF().gGetLineCode();
        String specifiedDainDataStr = String.format("%s#%s#%s#%s#%s#%s#%s",
                bureaCode,
                lineCode, rainDataEntity.getMonitorPointCode(),
                rainDataEntity.getHourRainfall()*10,rainDataEntity.getDayRainfall()*10,
                rainDataEntity.getContinuousRainfall()*10,
                df.format(new Date()));
        client.getBasicHttpBindingIAccessBusWCF().gSendSpecifiedRainData(specifiedDainDataStr);
        MonitorPointEntity monitorPointEntity = (MonitorPointEntity) monitorPointService.findById(rainDataEntity.getMonitorPointCode());
        String rainDataStr = String.format("%s#%s#%s#%s#%s",
                bureaCode,
                lineCode, monitorPointEntity.getKm()*1000+monitorPointEntity.getMeter(),
                0,df.format(new Date()));
        client.getBasicHttpBindingIAccessBusWCF().aHandleRainData("gate_0",rainDataStr);
        return true;
    }
}
