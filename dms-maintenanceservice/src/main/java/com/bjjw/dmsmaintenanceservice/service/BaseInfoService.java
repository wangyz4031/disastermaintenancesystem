package com.bjjw.dmsmaintenanceservice.service;

import org.springframework.data.domain.Sort;

import java.util.List;

public interface BaseInfoService<T> {
    long getAllCount();
    List<T> queryAllByLimit(int page, int limit);
    T findById(String id);
    boolean save(T t);
    boolean deleteById(String id);
    List<T> findAll();
    List<T> findMonitorPointEntitiesBySensorType(int sensorType, Sort sort);
}
