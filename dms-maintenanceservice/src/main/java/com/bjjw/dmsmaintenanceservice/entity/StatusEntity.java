
package com.bjjw.dmsmaintenanceservice.entity;

import com.bjjw.dmsmaintenanceservice.webservice.SensorType;

import java.util.Date;

public class StatusEntity extends Entity
{
    protected Date alarmConfirmTime;
    protected String alarmDes;
    protected Date alarmResumeTime;
    protected Date alarmStartTime;
    protected int km;
    protected int meter;
    protected SensorType sensorType;

    public Date getAlarmConfirmTime() {
        return alarmConfirmTime;
    }

    public void setAlarmConfirmTime(Date alarmConfirmTime) {
        this.alarmConfirmTime = alarmConfirmTime;
    }

    public String getAlarmDes() {
        return alarmDes;
    }

    public void setAlarmDes(String alarmDes) {
        this.alarmDes = alarmDes;
    }

    public Date getAlarmResumeTime() {
        return alarmResumeTime;
    }

    public void setAlarmResumeTime(Date alarmResumeTime) {
        this.alarmResumeTime = alarmResumeTime;
    }

    public Date getAlarmStartTime() {
        return alarmStartTime;
    }

    public void setAlarmStartTime(Date alarmStartTime) {
        this.alarmStartTime = alarmStartTime;
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

    public SensorType getSensorType() {
        return sensorType;
    }

    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }
}
