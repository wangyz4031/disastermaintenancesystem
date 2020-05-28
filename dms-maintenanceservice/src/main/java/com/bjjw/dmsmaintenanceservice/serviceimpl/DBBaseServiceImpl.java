package com.bjjw.dmsmaintenanceservice.serviceimpl;

import com.bjjw.dmsmaintenanceservice.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class DBBaseServiceImpl<R extends JpaRepository,T> implements BaseInfoService {
    @Autowired R r;
    public List<T> queryAllByLimit(int page,int limit){
        Sort sort = Sort.by(Sort.Order.asc("id"));
        Pageable pageable = PageRequest.of(page-1, limit, sort);
        Page<T> pageObject= r.findAll(pageable);
        return pageObject.getContent();
    }

    public long getAllCount(){
        Sort sort = Sort.by(Sort.Order.asc("id"));
        return r.count();
    }

    public T findById(String id){
        T t= (T) r.getOne(id);
        return t;
    }

    public boolean save(Object t){
        r.save(t);
        return true;
    }

    public boolean deleteById(String id){
        r.deleteById(id);
        return true;
    }

    public List<T> findAll(){
        Sort sort = Sort.by(Sort.Order.asc("id"));
        return r.findAll(sort);
    }

    public List<T> findMonitorPointEntitiesBySensorType(int sensorType, Sort sort){
        return null;
    }
}
