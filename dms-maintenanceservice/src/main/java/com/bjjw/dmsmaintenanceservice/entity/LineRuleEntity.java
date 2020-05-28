package com.bjjw.dmsmaintenanceservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DP_B_LINERULE_DICT2")
public class LineRuleEntity {
    /***
     * id
     */
    @Id
    @Column(name = "S_ID")
    private String id;

    /**
     * 监测点编码
      */
    @Column(name = "S_MONITORINGPOINTCODE")
    private String monitorPointCode;

    /**
     * 线路名称
     */
    @Column(name = "S_LINENAME")
    private String lineName;
    /**
     * 线路编码
     */
    @Column(name = "S_LINECODE")
    private String lineCode;

    /**
     * 开始值
     */
    @Column(name = "S_STARTVALUE")
    private String startValue;


    /**
     * 结束值
     */
    @Column(name = "S_ENDVALUE")
    private String endValue;

    /**
     * 启用标记
     */
    @Column(name = "C_ABLEFLAG")
    private int ableFlag;

    /**
     * 类型
     */
    @Column(name = "S_TYPE")
    private String type;

    /**
     * 开始标记
     */
    @Column(name = "S_STARTSIGN")
    private String startSign;

    /**
     * 结束标记
     */
    @Column(name = "S_ENDSIGN")
    private String endSign;

    /**
     * 报警子类型
     */
    @Column(name = "S_SUBTYPE")
    private String subType;

    /**
     * 组
     */
    @Column(name = "S_GROUP")
    private String group;

    /**
     * ModeName
     */
    @Column(name = "S_MODENAME")
    private String modeName;

    /**
     * 报警级别
     */
    @Column(name = "C_LEVEL")
    private int level;

    /**
     * 限速值
     */
    @Column(name = "I_SPEED")
    private int limitSpeed;

    /**
     * 描述
     */
    @Column(name = "S_DESC")
    private String desc;

    /**
     * 报警类型编码
     */
    @Column(name = "S_ALARMTYPECODE")
    private String alarmTypeCode;

    /**
     * 报警类型名称
     */
    @Column(name = "S_ALARMTYPENAME")
    private String alarmTypeName;

    /**
     * 局编码
     */
    @Column(name = "S_BUREACODE")
    private String bureaCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMonitorPointCode() {
        return monitorPointCode;
    }

    public void setMonitorPointCode(String monitorPointCode) {
        this.monitorPointCode = monitorPointCode;
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

    public String getStartValue() {
        return startValue;
    }

    public void setStartValue(String startValue) {
        this.startValue = startValue;
    }

    public String getEndValue() {
        return endValue;
    }

    public void setEndValue(String endValue) {
        this.endValue = endValue;
    }

    public int getAbleFlag() {
        return ableFlag;
    }

    public void setAbleFlag(int ableFlag) {
        this.ableFlag = ableFlag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartSign() {
        return startSign;
    }

    public void setStartSign(String startSign) {
        this.startSign = startSign;
    }

    public String getEndSign() {
        return endSign;
    }

    public void setEndSign(String endSign) {
        this.endSign = endSign;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLimitSpeed() {
        return limitSpeed;
    }

    public void setLimitSpeed(int limitSpeed) {
        this.limitSpeed = limitSpeed;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAlarmTypeCode() {
        return alarmTypeCode;
    }

    public void setAlarmTypeCode(String alarmTypeCode) {
        this.alarmTypeCode = alarmTypeCode;
    }

    public String getAlarmTypeName() {
        return alarmTypeName;
    }

    public void setAlarmTypeName(String alarmTypeName) {
        this.alarmTypeName = alarmTypeName;
    }

    public String getBureaCode() {
        return bureaCode;
    }

    public void setBureaCode(String bureaCode) {
        this.bureaCode = bureaCode;
    }
}
