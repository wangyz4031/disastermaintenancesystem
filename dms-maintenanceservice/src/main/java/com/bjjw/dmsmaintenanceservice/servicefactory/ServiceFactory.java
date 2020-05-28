package com.bjjw.dmsmaintenanceservice.servicefactory;

import com.bjjw.dmsmaintenanceservice.service.BaseInfoService;

import java.util.Map;

public class ServiceFactory {
    /**
     * Map中的Value是 ServiceBean
     */
    private Map<String, BaseInfoService> serviceMap;
    /**
     * 返回对应的 Service
     *
     * @param serviceImplName
     * @return
     */
    public BaseInfoService createSystemService(String serviceImplName) {
        return serviceMap.get(serviceImplName);
    }
    public void setServiceMap(Map<String, BaseInfoService> serviceMap) {
        this.serviceMap = serviceMap;
    }
}
