package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.entity.MonitorPointEntity;
import com.bjjw.dmsmaintenanceservice.entity.StationEntity;
import com.bjjw.dmsmaintenanceservice.service.BaseInfoService;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("monitorpoint")
public class MonitorPointController extends BaseController<MonitorPointEntity> {
    @GetMapping("forwardAddAndEdit")
    public ModelAndView forwardAddAndEdit(@RequestParam(required = false) String id){
        ModelAndView modelAndView = new ModelAndView("addeditmonitorpoint");
        MonitorPointEntity monitorPointEntity = new MonitorPointEntity();
        monitorPointEntity.setSortId(1);
        if(id != null){
            monitorPointEntity = (MonitorPointEntity)baseInfoService.findById(id);
        }
        modelAndView.addObject("entityInfo",monitorPointEntity);
        return modelAndView;
    }


    @GetMapping("queryAllBySensorType")
    public Map<String, Object> queryAll(int SensorType){
        BaseInfoService monitorPointService = createSystemService("monitorPointDBService", "monitorPointXmlService");
        Sort sort = Sort.by(Sort.Order.asc("id"));
        List<MonitorPointEntity> monitorPointEntityList = monitorPointService.findMonitorPointEntitiesBySensorType(SensorType,sort);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("data", monitorPointEntityList);
        return result;
    }




    @GetMapping("queryAllRelationMonitorPointsById")
    public Map<String, Object> queryAllMonitorPointById(String id){
        Map<String, Object> result = new HashMap<String, Object>();
        List<MonitorPointEntity> monitorPointEntityList = baseInfoService.findAll();
        BaseInfoService stationService = createSystemService("stationDBService", "stationXmlService");
        List<StationEntity> stationEntityList = stationService.findAll();
        MonitorPointEntity beforeMonitorPoint=null;
        MonitorPointEntity nextMonitorPoint=null;
        MonitorPointEntity curentMonitorPoint=null;
        String startAreaName="起始站";
        String endAreaName="终点站";
        for (int i=0;i<monitorPointEntityList.size();i++) {
            if(monitorPointEntityList.get(i).getId().equals(id)){
                curentMonitorPoint = monitorPointEntityList.get(i);
                for(int j=i-1; j>=0;j--){
                    if(monitorPointEntityList.get(j).getSensorType()==monitorPointEntityList.get(i).getSensorType()){
                        beforeMonitorPoint=monitorPointEntityList.get(j);
                        for(int h=stationEntityList.size()-1;h>=0;h--){
                            StationEntity stationEntity = stationEntityList.get(h);
                            int stationKmMeter =stationEntity.getKm()*1000+stationEntity.getMeter();
                            int beforeMonitorPointKmMeter =beforeMonitorPoint.getKm()*1000+stationEntity.getMeter();
                            if(stationKmMeter <=beforeMonitorPointKmMeter){
                                startAreaName=stationEntity.getStationName();
                                break;
                            }
                        }
                        break;
                    }
                }
                for (int k=i+1;k<monitorPointEntityList.size();k++){
                    if(monitorPointEntityList.get(k).getSensorType()==monitorPointEntityList.get(i).getSensorType()){
                        nextMonitorPoint=monitorPointEntityList.get(k);
                        for(int s=0;s<stationEntityList.size();s++){
                            StationEntity stationEntity = stationEntityList.get(s);
                            int stationKmMeter =stationEntity.getKm()*1000+stationEntity.getMeter();
                            int nextMonitorPointKmMeter =nextMonitorPoint.getKm()*1000+stationEntity.getMeter();
                            if(stationKmMeter >= nextMonitorPointKmMeter){
                                endAreaName=stationEntity.getStationName();
                                break;
                            }
                        }
                        break;
                    }
                }

            }
        }
        result.put("currentMonitorPoint", curentMonitorPoint);
        result.put("beforeMonitorPoint", beforeMonitorPoint);
        result.put("nextMonitorPoint", nextMonitorPoint);
        result.put("startAreaName", startAreaName);
        result.put("endAreaName", endAreaName);
        return result;
    }

}
