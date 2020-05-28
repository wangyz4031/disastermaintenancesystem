package com.bjjw.dmsmaintenanceservice;

import com.bjjw.dmsmaintenanceservice.entity.MessageEntity;
import com.bjjw.dmsmaintenanceservice.serviceimpl.MessageDBServiceImpl;
import com.bjjw.dmsmaintenanceservice.serviceimpl.WindDataDBServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.*;

@SpringBootApplication
public class DmsMaintenanceServiceApplication  implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(DmsMaintenanceServiceApplication.class,args);
    }
    @Autowired
    WindDataDBServiceImpl windDataDBService;
    @Autowired
    MessageDBServiceImpl messageDBService;
    @Autowired
    Environment environment;

    @Override
    public void run(String... args) throws Exception {
        Timer alarmTimer = new Timer();
        alarmTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                List<Object> windDataEntityList=windDataDBService.findWindExceptionDataList();
                if(windDataEntityList.size()>=1){
                    String telephoneString= environment.getProperty("telephoneno");
                    String[] telephoneNoArray = telephoneString.split(",");
                    for (String telenphoneno:telephoneNoArray) {
                        Date date = new Date();
                        MessageEntity messageEntity= new MessageEntity();
                        messageEntity.setMsgId(1);
                        messageEntity.setCommport(0);
                        messageEntity.setExpressLevel("2");
                        messageEntity.setMessageTitle("系统存在攒数据异常，请立刻前往现场处理");
                        messageEntity.setReceiver(telenphoneno);
                        messageEntity.setMessageType("0");
                        messageEntity.setSendTime(date);
                        messageDBService.save(messageEntity);
                    }
                }
            }
        },2*1000,60*1000);
    }
}
