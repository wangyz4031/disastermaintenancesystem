package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.entity.MonitorPointEntity;
import com.bjjw.dmsmaintenanceservice.entity.SnowBenchMarkEntity;
import com.bjjw.dmsmaintenanceservice.service.BaseInfoService;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("snowbenchmark")
public class SnowBenchMarkController extends BaseController<SnowBenchMarkEntity> {
    @GetMapping("forwardAddAndEdit")
    public ModelAndView forwardAddAndEdit(@RequestParam(required = false) String id){
        ModelAndView modelAndView = new ModelAndView("addeditsnowbenchmark");
        SnowBenchMarkEntity snowBenchMarkEntity = new SnowBenchMarkEntity();
        if(id != null){
            snowBenchMarkEntity = (SnowBenchMarkEntity)baseInfoService.findById(id);
        }
        BaseInfoService monitorPointService = createSystemService("monitorPointDBService", "monitorPointXmlService");
        Sort sort = Sort.by(Sort.Order.asc("id"));
        List<MonitorPointEntity> monitorPointEntityList = monitorPointService.findMonitorPointEntitiesBySensorType(3,sort);
        modelAndView.addObject("monitorPointEntityList",monitorPointEntityList);
        if(snowBenchMarkEntity.getId() == null){
            snowBenchMarkEntity.setId(monitorPointEntityList.get(0).getId());
            snowBenchMarkEntity.setKm(monitorPointEntityList.get(0).getKm());
            snowBenchMarkEntity.setMeter(monitorPointEntityList.get(0).getMeter());
            snowBenchMarkEntity.setLineCode(monitorPointEntityList.get(0).getLineCode());
            snowBenchMarkEntity.setLineName(monitorPointEntityList.get(0).getLineName());
            snowBenchMarkEntity.setMonitorUnitCode(monitorPointEntityList.get(0).getBaseStationCode());
        }
        modelAndView.addObject("entityInfo",snowBenchMarkEntity);
        return modelAndView;
    }
}
