package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.entity.BaseStationEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("basestation")
public class BaseStationController extends BaseController<BaseStationEntity> {
    @GetMapping("forwardAddAndEdit")
    public ModelAndView forwardAddAndEdit(@RequestParam(required = false) String id){
        ModelAndView modelAndView = new ModelAndView("addeditbasestation");
        BaseStationEntity baseStationEntity = new BaseStationEntity();
        baseStationEntity.setSortId(1);
        if(id != null){
            baseStationEntity = (BaseStationEntity) baseInfoService.findById(id);
        }
        modelAndView.addObject("entityInfo",baseStationEntity);
        return modelAndView;
    }
}
