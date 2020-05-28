package com.bjjw.dmsmaintenanceservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DP_B_MONITORINGPOINTINFO")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class MonitorPointEntity {

    /***
     * id
     */
    @Id
    @Column(name = "S_ID")
    private String id;
    /***
     * 线路名称
     */
    @Column(name = "S_LINENAME")
    private String lineName;
    /***
     * 线路编码
     */
    @Column(name = "S_LINECODE")
    private String lineCode;
    /***
     * 基站编码
     */
    @Column(name = "S_BASESTATIONCODE")
    private String baseStationCode;
    /***
     * 监测点类型
     */
    @Column(name = "S_SENSORTYPE")
    private int sensorType;
    /***
     * 公里数
     */
    @Column(name = "I_KM")
    private int km;
    /***
     * 米数
     */
    @Column(name = "I_METER")
    private int meter;
    /***
     * 是否启用
     */
    @Column(name = "C_ABLEFLAG")
    private int ableFlag;

    /***
     * 监测点名称
     */
    @Column(name = "S_MONITORPOINTNAME")
    private String monitorPointName;

    /***
     * 公里数前缀
     */
    @Column(name = "S_KMPREFIX")
    private String kmPrefix;

    /***
     * 排序id
     */
    @Column(name = "I_SORTID")
    private int sortId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public String getBaseStationCode() {
        return baseStationCode;
    }

    public void setBaseStationCode(String baseStationCode) {
        this.baseStationCode = baseStationCode;
    }

    public int getSensorType() {
        return sensorType;
    }

    public void setSensorType(int sensorType) {
        this.sensorType = sensorType;
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

    public int getAbleFlag() {
        return ableFlag;
    }

    public void setAbleFlag(int ableFlag) {
        this.ableFlag = ableFlag;
    }

    public String getMonitorPointName() {
        return monitorPointName;
    }

    public void setMonitorPointName(String monitorPointName) {
        this.monitorPointName = monitorPointName;
    }

    public String getKmPrefix() {
        return kmPrefix;
    }

    public void setKmPrefix(String kmPrefix) {
        this.kmPrefix = kmPrefix;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }
}
