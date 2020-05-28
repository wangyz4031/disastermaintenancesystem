package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.entity.MonitorPointEntity;
import com.bjjw.dmsmaintenanceservice.entity.ProcessSegmentEntity;
import com.bjjw.dmsmaintenanceservice.service.BaseInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("processsegment")
public class ProcessSegmentController extends BaseController<ProcessSegmentEntity> {
    @GetMapping("forwardAddAndEdit")
    public ModelAndView forwardAddAndEdit(@RequestParam(required = false) String id){
        ModelAndView modelAndView = new ModelAndView("addeditprocesssegment");
        ProcessSegmentEntity processSegmentEntity = new ProcessSegmentEntity();
        processSegmentEntity.setSortId(1);
        if(id != null){
            processSegmentEntity = (ProcessSegmentEntity) baseInfoService.findById(id);
        }
        BaseInfoService monitorPointService = createSystemService("monitorPointDBService", "monitorPointXmlService");
        List<MonitorPointEntity> monitorPointEntityList = monitorPointService.findAll();
        modelAndView.addObject("monitorPointEntityList",monitorPointEntityList);

        if(processSegmentEntity.getId() == null){
            processSegmentEntity.setLineCode(monitorPointEntityList.get(0).getLineCode());
            processSegmentEntity.setLineName(monitorPointEntityList.get(0).getLineName());
            processSegmentEntity.setMonitorUnitCode(monitorPointEntityList.get(0).getBaseStationCode());
            processSegmentEntity.setStartKmDirection("r");
            processSegmentEntity.setEndKmDirection("r");
            processSegmentEntity.setStartKmPrefix("K");
            processSegmentEntity.setEndKmPrefix("K");
            processSegmentEntity.setAreaName("起始站~终点站");
        }

        modelAndView.addObject("entityInfo",processSegmentEntity);
        return modelAndView;
    }

    @PostMapping("insertProcessSegment")
    public Map<String, Object> insertProcessSegment(@RequestBody ProcessSegmentEntity processSegmentEntity) {
        baseInfoService = getService();
        processSegmentEntity.setId(UUID.randomUUID().toString().replace("-", ""));
        baseInfoService.save(processSegmentEntity);
        Map<String,Object> result = new HashMap<>();
        result.put("id",processSegmentEntity.getId());
        result.put("result",true);
        return result;
    }

}
