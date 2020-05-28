package com.bjjw.dmsmaintenanceservice.repository;

import com.bjjw.dmsmaintenanceservice.entity.WindDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WindDataRepository extends JpaRepository<WindDataEntity, String> {
//    Optional<WindDataEntity> findByDbCreateTimeGreaterThanD(Long pid);

    @Query(value = "select s_linecode,s_monitoringpointcode,i_km,i_meter,s_monitoringtime,d_createtime,d_dbcreatetime from (select ROW_NUMBER()over(partition by s_monitoringpointcode order by x.d_createtime desc) as tid,x.* from wd_m_monitordata x) b where b.tid=1 and ceil(((d_dbcreatetime - d_createtime))*24*60) >1", nativeQuery=true)
    List<Object> findWindExceptionDataList();
}
