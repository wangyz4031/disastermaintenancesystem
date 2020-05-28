package com.bjjw.dmsmaintenanceservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DP_B_PROCESSSEGMENT")
public class ProcessSegmentEntity {

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
     * 局编码
     */
    @Column(name = "S_BUREACODE")
    private String bureaCode;

    /***
     * 子线ID
     */
    @Column(name = "I_DIVID")
    private int divId;

    /***
     * 线路编码
     */
    @Column(name = "S_LINECODE")
    private String lineCode;

    /***
     * 监控单元编码
     */
    @Column(name = "S_MONITORINGUNITCODE")
    private String monitorUnitCode;

    /**
     *监测点编码
     */
    @Column(name = "S_MONITORINGPOINTCODE")
    private String monitorPointCode;

    /**
     *影响区间编码
     */
    @Column(name = "S_AREACODE")
    private String areaCode;

    /**
     *影响区间名称
     */
    @Column(name = "S_AREANAME")
    private String areaName;

    /**
     *开始限速区段公里数前缀
     */
    @Column(name = "S_STARTKMPREFIX")
    private String startKmPrefix;

    /**
     *开始限速区段公里数
     */
    @Column(name = "I_STARTKILOMETER")
    private int startSegmentKm;

    /**
     *开始限速区段米数
     */
    @Column(name = "I_STARTMETER")
    private int startSegmentMeter;

    /**
     *开始公里标方向
     */
    @Column(name = "S_STARTKMDIRECTION")
    private String startKmDirection;

    /**
     *结束限速区段公里数前缀
     */
    @Column(name = "S_ENDKMPREFIX")
    private String endKmPrefix;

    /**
     *结束限速区段公里数
     */
    @Column(name = "I_ENDKILOMETER")
    private int endSegmentKm;

    /**
     *结束限速区段米数
     */
    @Column(name = "I_ENDMETER")
    private int endSegmentMeter;

    /**
     *结束公里标方向
     */
    @Column(name = "S_ENDKMDIRECTION")
    private String endKmDirection;


    /***
     * 限速标记
     */
    @Column(name = "C_TAGSPEED")
    private int tagSpeed;

    /***
     * 排序id
     */
    @Column(name = "I_SORTID")
    private int sortId;

    /***
     * 启用标记
     */
    @Column(name = "C_ABLEFLAG")
    private int ableFlag;

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

    public String getBureaCode() {
        return bureaCode;
    }

    public void setBureaCode(String bureaCode) {
        this.bureaCode = bureaCode;
    }

    public int getDivId() {
        return divId;
    }

    public void setDivId(int divId) {
        this.divId = divId;
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
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

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getStartKmPrefix() {
        return startKmPrefix;
    }

    public void setStartKmPrefix(String startKmPrefix) {
        this.startKmPrefix = startKmPrefix;
    }

    public int getStartSegmentKm() {
        return startSegmentKm;
    }

    public void setStartSegmentKm(int startSegmentKm) {
        this.startSegmentKm = startSegmentKm;
    }

    public int getStartSegmentMeter() {
        return startSegmentMeter;
    }

    public void setStartSegmentMeter(int startSegmentMeter) {
        this.startSegmentMeter = startSegmentMeter;
    }

    public String getStartKmDirection() {
        return startKmDirection;
    }

    public void setStartKmDirection(String startKmDirection) {
        this.startKmDirection = startKmDirection;
    }

    public String getEndKmPrefix() {
        return endKmPrefix;
    }

    public void setEndKmPrefix(String endKmPrefix) {
        this.endKmPrefix = endKmPrefix;
    }

    public int getEndSegmentKm() {
        return endSegmentKm;
    }

    public void setEndSegmentKm(int endSegmentKm) {
        this.endSegmentKm = endSegmentKm;
    }

    public int getEndSegmentMeter() {
        return endSegmentMeter;
    }

    public void setEndSegmentMeter(int endSegmentMeter) {
        this.endSegmentMeter = endSegmentMeter;
    }

    public String getEndKmDirection() {
        return endKmDirection;
    }

    public void setEndKmDirection(String endKmDirection) {
        this.endKmDirection = endKmDirection;
    }

    public int getTagSpeed() {
        return tagSpeed;
    }

    public void setTagSpeed(int tagSpeed) {
        this.tagSpeed = tagSpeed;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    public int getAbleFlag() {
        return ableFlag;
    }

    public void setAbleFlag(int ableFlag) {
        this.ableFlag = ableFlag;
    }
}
