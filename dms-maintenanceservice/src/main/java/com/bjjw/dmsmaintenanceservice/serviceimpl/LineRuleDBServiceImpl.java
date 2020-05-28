package com.bjjw.dmsmaintenanceservice.serviceimpl;

import com.bjjw.dmsmaintenanceservice.entity.LineRuleEntity;
import com.bjjw.dmsmaintenanceservice.repository.LineRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineRuleDBServiceImpl extends DBBaseServiceImpl<LineRuleRepository,LineRuleEntity> {
    @Autowired
    protected LineRuleRepository lineRuleRepository;
    @Override
    public List<LineRuleEntity> queryAllByLimit(int page, int limit){
        Sort sort = Sort.by(Sort.Order.asc("monitorPointCode"),Sort.Order.asc("id"));
        Pageable pageable = PageRequest.of(page-1, limit, sort);
        Page<LineRuleEntity> pageObject= lineRuleRepository.findAll(pageable);
        return pageObject.getContent();
    }
}
