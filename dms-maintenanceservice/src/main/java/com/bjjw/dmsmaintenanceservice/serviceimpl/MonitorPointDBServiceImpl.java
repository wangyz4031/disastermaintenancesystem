package com.bjjw.dmsmaintenanceservice.serviceimpl;

import com.bjjw.dmsmaintenanceservice.entity.MonitorPointEntity;
import com.bjjw.dmsmaintenanceservice.repository.MonitorPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorPointDBServiceImpl extends DBBaseServiceImpl<MonitorPointRepository, MonitorPointEntity> {
    @Autowired
    protected MonitorPointRepository monitorPointRepository;
    public List<MonitorPointEntity> findMonitorPointEntitiesBySensorType(int sensorType, Sort sort){
        return monitorPointRepository.findMonitorPointEntitiesBySensorType(sensorType,sort);
    }
}
