package com.bjjw.dmsmaintenanceservice.config;

import com.bjjw.dmsmaintenanceservice.service.BaseInfoService;
import com.bjjw.dmsmaintenanceservice.servicefactory.ServiceFactory;
import com.bjjw.dmsmaintenanceservice.serviceimpl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ServiceConfig {
    @Resource
    private BaseStationDBServiceImpl baseStationDBService;
    @Resource
    private BaseStationXmlServiceImpl baseStationXmlService;
    @Resource
    private LineRuleDBServiceImpl lineRuleDBService;
    @Resource
    private LineRuleXmlServiceImpl lineRuleXmlService;
    @Resource
    private MonitorPointDBServiceImpl monitorPointDBService;
    @Resource
    private MonitorPointXmlServiceImpl monitorPointXmlService;
    @Resource
    private ProcessSegmentDBServiceImpl processSegmentDBService;
    @Resource
    private ProcessSegmentXmlServiceImpl processSegmentXmlService;
    @Resource
    private SnowBenchMarkDBServiceImpl snowBenchMarkDBService;
    @Resource
    private SnowBenchMarkXmlServiceImpl snowBenchMarkXmlService;
    @Resource
    private StationDBServiceImpl stationDBService;
    @Resource
    private StationXmlServiceImpl stationXmlService;

    @Bean
    public ServiceFactory createFactory () {
        ServiceFactory factory = new ServiceFactory();
        Map<String, BaseInfoService> serviceMap = new HashMap<>();
        serviceMap.put("baseStationDBService",baseStationDBService);
        serviceMap.put("baseStationXmlService",baseStationXmlService);
        serviceMap.put("lineRuleDBService",lineRuleDBService);
        serviceMap.put("lineRuleXmlService",lineRuleXmlService);
        serviceMap.put("monitorPointDBService",monitorPointDBService);
        serviceMap.put("monitorPointXmlService",monitorPointXmlService);
        serviceMap.put("processSegmentDBService",processSegmentDBService);
        serviceMap.put("processSegmentXmlService",processSegmentXmlService);
        serviceMap.put("snowBenchMarkDBService",snowBenchMarkDBService);
        serviceMap.put("snowBenchMarkXmlService",snowBenchMarkXmlService);
        serviceMap.put("stationDBService",stationDBService);
        serviceMap.put("stationXmlService",stationXmlService);
        factory.setServiceMap(serviceMap);
        return factory;
    }
}
