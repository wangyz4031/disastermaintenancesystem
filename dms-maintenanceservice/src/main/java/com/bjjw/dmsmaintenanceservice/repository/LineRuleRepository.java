package com.bjjw.dmsmaintenanceservice.repository;

import com.bjjw.dmsmaintenanceservice.entity.LineRuleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineRuleRepository extends JpaRepository<LineRuleEntity, String> {
}
