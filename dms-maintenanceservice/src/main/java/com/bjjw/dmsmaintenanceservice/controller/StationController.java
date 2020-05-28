package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.entity.StationEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("station")
public class StationController extends BaseController<StationEntity> {
    @GetMapping("forwardAddAndEdit")
    public ModelAndView forwardAddAndEdit(@RequestParam(required = false) String id){
        ModelAndView modelAndView = new ModelAndView("addeditstation");
        StationEntity stationEntity = new StationEntity();
        stationEntity.setSortId(1);
        if(id != null){
            stationEntity = (StationEntity)baseInfoService.findById(id);
        }
        modelAndView.addObject("entityInfo",stationEntity);
        return modelAndView;
    }
}
