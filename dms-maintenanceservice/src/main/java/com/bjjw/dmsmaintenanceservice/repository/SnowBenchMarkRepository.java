package com.bjjw.dmsmaintenanceservice.repository;

import com.bjjw.dmsmaintenanceservice.entity.SnowBenchMarkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnowBenchMarkRepository extends JpaRepository<SnowBenchMarkEntity, String> {
}
