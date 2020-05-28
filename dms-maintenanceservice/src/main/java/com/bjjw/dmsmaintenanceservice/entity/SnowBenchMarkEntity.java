package com.bjjw.dmsmaintenanceservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SD_M_SNOWDEPTHBENCHMARK")
public class SnowBenchMarkEntity {
    /***
     * id
     */
    @Id
    @Column(name = "S_ID")
    private String id;
    /***
     * 线路编码
     */
    @Column(name = "S_LINECODE")
    private String lineCode;
    /***
     * 线路名称
     */
    @Column(name = "S_LINENAME")
    private String lineName;

    /***
     * 监控单元编码
     */
    @Column(name = "S_MONITORINGUNITCODE")
    private String monitorUnitCode;

    /***
     * 监测点编码
     */
    @Column(name = "S_MONITORINGPOINTCODE")
    private String monitorPointCode;

    /***
     * 类型
     */
    @Column(name = "S_DTYPE")
    private String dtype;

    /***
     * 雪深基准
     */
    @Column(name = "I_SNOWDEPTHBENCHMARK")
    private int snowBenchMark;

    /***
     * 千米数
     */
    @Column(name = "I_KM")
    private int km;
    /***
     * 米数
     */
    @Column(name = "I_METER")
    private int meter;

    /***
     * 监测时间
     */
    @Column(name = "S_MONITORINGTIME")
    private String monitorTime;

    /***
     * 局码
     */
    @Column(name = "S_RAILWAYADMINISTRATOR")
    private String railwayAdministrator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getMonitorUnitCode() {
        return monitorUnitCode;
    }

    public void setMonitorUnitCode(String monitorUnitCode) {
        this.monitorUnitCode = monitorUnitCode;
    }

    public String getMonitorPointCode() {
        return monitorPointCode;
    }

    public void setMonitorPointCode(String monitorPointCode) {
        this.monitorPointCode = monitorPointCode;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public int getSnowBenchMark() {
        return snowBenchMark;
    }

    public void setSnowBenchMark(int snowBenchMark) {
        this.snowBenchMark = snowBenchMark;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getMeter() {
        return meter;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }

    public String getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(String monitorTime) {
        this.monitorTime = monitorTime;
    }

    public String getRailwayAdministrator() {
        return railwayAdministrator;
    }

    public void setRailwayAdministrator(String railwayAdministrator) {
        this.railwayAdministrator = railwayAdministrator;
    }
}
