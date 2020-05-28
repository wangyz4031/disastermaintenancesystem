package com.bjjw.dmsmaintenanceservice.repository;

import com.bjjw.dmsmaintenanceservice.entity.BaseStationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseStationRepository extends JpaRepository<BaseStationEntity, String> {
}
