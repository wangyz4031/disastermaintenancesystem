package com.bjjw.dmsmaintenanceservice.repository;

import com.bjjw.dmsmaintenanceservice.entity.ProcessSegmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessSegmentRepository extends JpaRepository<ProcessSegmentEntity, String> {
}
