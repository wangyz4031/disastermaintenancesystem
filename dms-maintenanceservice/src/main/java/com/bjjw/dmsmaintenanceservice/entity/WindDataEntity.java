package com.bjjw.dmsmaintenanceservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "WD_M_MONITORDATA")
public class WindDataEntity {
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
    private String type;
    /***
     * 风速值
     */
    @Column(name = "I_DVALUE")
    private double value;
    /***
     * 环境风速
     */
    @Column(name = "I_ALARMWINDSPEED")
    private double alarmWindSpeed;
    /***
     * 环境风向
     */
    @Column(name = "I_ALARMWINDDIRECTION")
    private double alarmWindDirection;
    /***
     * 风速1
     */
    @Column(name = "I_WINDSPEED1")
    private double windSpeed1;

    /***
     * 风向1
     */
    @Column(name = "I_WINDDIRECTION1")
    private double windDirection1;

    /***
     * 风速2
     */
    @Column(name = "I_WINDSPEED2")
    private double windSpeed2;

    /***
     * 风向2
     */
    @Column(name = "I_WINDDIRECTION2")
    private double windDirection2;

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
     * 铁路局
     */
    @Column(name = "S_RAILWAYADMINISTRATOR")
    private String railwayAdministrator;

    /***
     * 监测时间
     */
    @Column(name = "D_CREATETIME")
    private Date createTime;

    /***
     * 数据入库时间
     */
    @Column(name = "D_DBCREATETIME")
    private Date dbCreateTime;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getAlarmWindSpeed() {
        return alarmWindSpeed;
    }

    public void setAlarmWindSpeed(double alarmWindSpeed) {
        this.alarmWindSpeed = alarmWindSpeed;
    }

    public double getAlarmWindDirection() {
        return alarmWindDirection;
    }

    public void setAlarmWindDirection(double alarmWindDirection) {
        this.alarmWindDirection = alarmWindDirection;
    }

    public double getWindSpeed1() {
        return windSpeed1;
    }

    public void setWindSpeed1(double windSpeed1) {
        this.windSpeed1 = windSpeed1;
    }

    public double getWindDirection1() {
        return windDirection1;
    }

    public void setWindDirection1(double windDirection1) {
        this.windDirection1 = windDirection1;
    }

    public double getWindSpeed2() {
        return windSpeed2;
    }

    public void setWindSpeed2(double windSpeed2) {
        this.windSpeed2 = windSpeed2;
    }

    public double getWindDirection2() {
        return windDirection2;
    }

    public void setWindDirection2(double windDirection2) {
        this.windDirection2 = windDirection2;
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

    public String getRailwayAdministrator() {
        return railwayAdministrator;
    }

    public void setRailwayAdministrator(String railwayAdministrator) {
        this.railwayAdministrator = railwayAdministrator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDbCreateTime() {
        return dbCreateTime;
    }

    public void setDbCreateTime(Date dbCreateTime) {
        this.dbCreateTime = dbCreateTime;
    }
}
