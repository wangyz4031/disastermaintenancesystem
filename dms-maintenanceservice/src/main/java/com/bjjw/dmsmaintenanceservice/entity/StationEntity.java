package com.bjjw.dmsmaintenanceservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DP_B_STATION")
public class StationEntity {
    /***
     * id
     */
    @Id
    @Column(name = "S_ID")
    private String id;

    /***
     * 车站名
     */
    @Column(name = "S_STATIONNAME")
    private String stationName;

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
     * 是否启用
     */
    @Column(name = "C_ABLEFLAG")
    private int ableFlag;

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

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
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

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }
}
