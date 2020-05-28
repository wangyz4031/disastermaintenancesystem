package com.bjjw.dmsmaintenanceservice.repository;

import com.bjjw.dmsmaintenanceservice.entity.MonitorPointEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonitorPointRepository extends JpaRepository<MonitorPointEntity, String> {
    List<MonitorPointEntity> findMonitorPointEntitiesBySensorType(int sensorType, Sort sort);
}
