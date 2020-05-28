package com.bjjw.dmsmaintenanceservice.serviceimpl;

import com.bjjw.dmsmaintenanceservice.entity.WindDataEntity;
import com.bjjw.dmsmaintenanceservice.repository.WindDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WindDataDBServiceImpl extends DBBaseServiceImpl<WindDataRepository, WindDataEntity> {
    @Autowired
    protected WindDataRepository windDataRepository;
    public List<Object> findWindExceptionDataList(){
        return windDataRepository.findWindExceptionDataList();
    }
}
