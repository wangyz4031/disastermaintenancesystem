package com.bjjw.dmsmaintenanceservice.controller;

import com.bjjw.dmsmaintenanceservice.entity.RainSnowSwitchEntity;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("rainsnowswitch")
public class RainSnowSwitchController{
    @Resource(name = "redis1Template")
    StringRedisTemplate redis1Template;

    @Resource(name = "redis2Template")
    StringRedisTemplate redis2Template;
    @PostMapping("setSwitchInfo")
    public boolean setSwitchInfo(@RequestBody RainSnowSwitchEntity rainSnowSwitchEntity){
        redis1Template.opsForValue().set("rainDataFlag",Integer.toString(rainSnowSwitchEntity.getRainDataFlag()));
        redis1Template.opsForValue().set("rainSensorFlag",Integer.toString(rainSnowSwitchEntity.getRainSensorFlag()));
        redis1Template.opsForValue().set("snowDataFlag",Integer.toString(rainSnowSwitchEntity.getSnowDataFlag()));
        redis1Template.opsForValue().set("snowSensorFlag",Integer.toString(rainSnowSwitchEntity.getSnowSensorFlag()));
        redis2Template.opsForValue().set("rainDataFlag",Integer.toString(rainSnowSwitchEntity.getRainDataFlag()));
        redis2Template.opsForValue().set("rainSensorFlag",Integer.toString(rainSnowSwitchEntity.getRainSensorFlag()));
        redis2Template.opsForValue().set("snowDataFlag",Integer.toString(rainSnowSwitchEntity.getSnowDataFlag()));
        redis2Template.opsForValue().set("snowSensorFlag",Integer.toString(rainSnowSwitchEntity.getSnowSensorFlag()));
        return true;
    }

    @GetMapping("getSwitchInfo")
    public Map<String,String> getSwitchInfo(){
        Map<String,String> result = new HashMap<>();
        result.put("rainDataFlag",redis1Template.opsForValue().get("rainDataFlag"));
        result.put("rainSensorFlag",redis1Template.opsForValue().get("rainSensorFlag"));
        result.put("snowDataFlag",redis1Template.opsForValue().get("snowDataFlag"));
        result.put("snowSensorFlag",redis1Template.opsForValue().get("snowSensorFlag"));
        return result;
    }
}
