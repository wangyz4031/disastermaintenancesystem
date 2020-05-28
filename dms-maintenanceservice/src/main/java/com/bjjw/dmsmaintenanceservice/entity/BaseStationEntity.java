package com.bjjw.dmsmaintenanceservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "DP_B_BASESTATIONINFO")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class BaseStationEntity{
    /***
     * id
     */
    @Id
    @Column(name = "S_ID")
    private String id;
    /***
     * 基站名称
     */
    @Column(name = "S_BASESTATIONNAME")
    private String baseStationName;
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
     * 主机A IP
     */
    @Column(name = "S_AIP")
    private String aip;
    /***
     * 主机B IP
     */
    @Column(name = "S_BIP")
    private String bip;

    /***
     * 主机A FTP地址
     */
    @Column(name = "S_AFTP")
    private String aftp;

    /***
     * 主机B FTP地址
     */
    @Column(name = "S_BFTP")
    private String bftp;

    /***
     * 更新时间
     */
    @Column(name = "S_UPGRADEDATETIME")
    private String upgradeDateTime;

    /***
     * 当前版本
     */
    @Column(name = "S_CURRENTVERSION")
    private String currentVersion;

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


    /***
     * 是否启用
     */
    @Column(name = "C_ABLEFLAG")
    private int ableFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBaseStationName() {
        return baseStationName;
    }

    public void setBaseStationName(String baseStationName) {
        this.baseStationName = baseStationName;
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

    public String getAip() {
        return aip;
    }

    public void setAip(String aip) {
        this.aip = aip;
    }

    public String getBip() {
        return bip;
    }

    public void setBip(String bip) {
        this.bip = bip;
    }

    public String getAftp() {
        return aftp;
    }

    public void setAftp(String aftp) {
        this.aftp = aftp;
    }

    public String getBftp() {
        return bftp;
    }

    public void setBftp(String bftp) {
        this.bftp = bftp;
    }

    public String getUpgradeDateTime() {
        return upgradeDateTime;
    }

    public void setUpgradeDateTime(String upgradeDateTime) {
        this.upgradeDateTime = upgradeDateTime;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
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

    public int getAbleFlag() {
        return ableFlag;
    }

    public void setAbleFlag(int ableFlag) {
        this.ableFlag = ableFlag;
    }
}
