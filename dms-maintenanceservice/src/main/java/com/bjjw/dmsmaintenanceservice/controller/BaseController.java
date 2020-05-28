package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.service.BaseInfoService;
import com.bjjw.dmsmaintenanceservice.servicefactory.ServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
public class BaseController<T> {
    @Autowired
    ServiceFactory serviceFactory;
    @Autowired
    private Environment environment;

    BaseInfoService baseInfoService=null;
    @GetMapping("queryAllByLimit")
    public Map<String, Object> queryAllByLimit( @RequestParam("page") int page, @RequestParam("limit") int limit){
        baseInfoService = getService();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", 0);
        result.put("msg", "");
        result.put("count", baseInfoService.getAllCount());
        result.put("data", baseInfoService.queryAllByLimit(page,limit));
        return result;
    }

    protected BaseInfoService getService() {
        switch (getModelName()){
            case "StationEntity":
                return createSystemService("stationDBService", "stationXmlService");
            case "BaseStationEntity":
                return createSystemService("baseStationDBService", "baseStationXmlService");
            case "LineRuleEntity":
                return createSystemService("lineRuleDBService", "lineRuleXmlService");
            case "MonitorPointEntity":
                return createSystemService("monitorPointDBService", "monitorPointXmlService");
            case "ProcessSegmentEntity":
                return createSystemService("processSegmentDBService", "processSegmentXmlService");
            case "SnowBenchMarkEntity":
                return createSystemService("snowBenchMarkDBService", "snowBenchMarkXmlService");
            default:
                return null;
        }
    }

    protected BaseInfoService createSystemService(String dbService, String xmlService) {
        baseInfoService = null;
        if (environment.getProperty("datasource").equals("db")) {
            baseInfoService = serviceFactory.createSystemService(dbService);
        } else {
            baseInfoService = serviceFactory.createSystemService(xmlService);
        }
        return baseInfoService;
    }

    @GetMapping("queryAllById")
    public Map<String, Object> queryAllById(String id){
        baseInfoService = getService();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("data", baseInfoService.findById(id));
        return result;
    }


    @GetMapping("queryAll")
    public Map<String, Object> queryAll(){
        baseInfoService = getService();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("data", baseInfoService.findAll());
        return result;
    }

    @PostMapping("insert")
    public boolean insert(@RequestBody T t) {
        baseInfoService = getService();
        return baseInfoService.save(t);
    }
    @DeleteMapping("delete")
    public boolean delete(String id) {
        baseInfoService = getService();
        return baseInfoService.deleteById(id);
    }
    @PostMapping("update")
    public boolean update(@RequestBody T t) {
        baseInfoService = getService();
        return baseInfoService.save(t);
    }

    protected String getModelName() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType p = (ParameterizedType) t ;
        Class<T> c = (Class<T>) p.getActualTypeArguments()[0];
        return c.getSimpleName();
    }

}
