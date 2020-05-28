package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.entity.LineRuleEntity;
import com.bjjw.dmsmaintenanceservice.entity.MonitorPointEntity;
import com.bjjw.dmsmaintenanceservice.service.BaseInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("linerule")
public class LineRuleController extends BaseController<LineRuleEntity> {
    @GetMapping("queryAllLineRuleByLimit")
    public Map<String, Object> queryAllLineRuleByLimit(@RequestParam Map<String, Object> params){
        baseInfoService = getService();
        int page=Integer.parseInt(params.get("page").toString());
        int limit=Integer.parseInt(params.get("limit").toString());
        String monitorPointCode= (String) params.get("monitorPointCode");
        String type= (String) params.get("type");
        String level=(String) params.get("level");
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", 0);
        result.put("msg", "");

        List<LineRuleEntity> lineRuleEntityList=baseInfoService.findAll();
        if(monitorPointCode!="" && monitorPointCode!=null){
            lineRuleEntityList= lineRuleEntityList.stream().filter(x-> x.getMonitorPointCode().equals(monitorPointCode)).collect(Collectors.toList());
        }
        if(type!="" && type!=null){
            lineRuleEntityList= lineRuleEntityList.stream().filter(x-> x.getType().equals(type)).collect(Collectors.toList());
        }
        if(level !="" && level!=null){
            int alarmLevel=Integer.parseInt(level);
            lineRuleEntityList= lineRuleEntityList.stream().filter(x-> x.getLevel()==alarmLevel).collect(Collectors.toList());
        }
        int endIndex;
        if (page * limit > lineRuleEntityList.size()) {
            endIndex = lineRuleEntityList.size();
        } else {
            endIndex = page * limit;
        }
        lineRuleEntityList.sort((a, b) -> Integer.parseInt(a.getMonitorPointCode()) - Integer.parseInt(b.getMonitorPointCode()));
        result.put("count", lineRuleEntityList.size());
        lineRuleEntityList = lineRuleEntityList.subList((page - 1) * limit, endIndex);
        result.put("data", lineRuleEntityList);
        return result;
    }

    @GetMapping("forwardAddAndEdit")
    public ModelAndView forwardAddAndEdit(@RequestParam(required = false) String id){
        ModelAndView modelAndView = new ModelAndView("addeditlinerule");
        LineRuleEntity lineRuleEntity = new LineRuleEntity();
        if(id != null){
            lineRuleEntity = (LineRuleEntity)baseInfoService.findById(id);
        }
        BaseInfoService monitorPointService = createSystemService("monitorPointDBService", "monitorPointXmlService");
        List<MonitorPointEntity> monitorPointEntityList = monitorPointService.findAll();
        modelAndView.addObject("monitorPointEntityList",monitorPointEntityList);
        if(lineRuleEntity.getId() == null){
            lineRuleEntity.setLineCode(monitorPointEntityList.get(0).getLineCode());
            lineRuleEntity.setLineName(monitorPointEntityList.get(0).getLineName());
            lineRuleEntity.setType(Integer.toString(monitorPointEntityList.get(0).getSensorType()));
            lineRuleEntity.setAlarmTypeCode(Integer.toString(monitorPointEntityList.get(0).getSensorType()));
            switch (monitorPointEntityList.get(0).getSensorType()){
                case 1:
                    lineRuleEntity.setAlarmTypeName("风");
                    break;
                case 2:
                    lineRuleEntity.setAlarmTypeName("雨");
                    break;
                case 3:
                    lineRuleEntity.setAlarmTypeName("雪");
                    break;
                case 4:
                    lineRuleEntity.setAlarmTypeName("异物");
                    break;
            }
        }

        modelAndView.addObject("entityInfo",lineRuleEntity);
        return modelAndView;
    }

    @PostMapping("insertLineRule")
    public Map<String, Object> insertLineRule(@RequestBody LineRuleEntity lineRuleEntity) {
        baseInfoService = getService();
        lineRuleEntity.setId(UUID.randomUUID().toString().replace("-", ""));
        baseInfoService.save(lineRuleEntity);
        Map<String,Object> result = new HashMap<>();
        result.put("id",lineRuleEntity.getId());
        result.put("result",true);
        return result;
    }
}
