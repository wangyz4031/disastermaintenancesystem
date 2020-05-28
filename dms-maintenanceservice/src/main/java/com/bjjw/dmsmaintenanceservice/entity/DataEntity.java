
package com.bjjw.dmsmaintenanceservice.entity;

import com.bjjw.dmsmaintenanceservice.webservice.MonitorDataType;

public class DataEntity extends Entity
{
    protected String bureauName;
    protected MonitorDataType dataType;
    protected boolean dataValid;
    protected double dataValue;
    protected int km;
    protected int meter;
    protected int monitorUnitKm;
    protected int monitorUnitMeter;
    protected String speed;

    public String getBureauName() {
        return bureauName;
    }

    public void setBureauName(String bureauName) {
        this.bureauName = bureauName;
    }

    public MonitorDataType getDataType() {
        return dataType;
    }

    public void setDataType(MonitorDataType dataType) {
        this.dataType = dataType;
    }

    public Boolean getDataValid() {
        return dataValid;
    }

    public void setDataValid(Boolean dataValid) {
        this.dataValid = dataValid;
    }

    public Double getDataValue() {
        return dataValue;
    }

    public void setDataValue(Double dataValue) {
        this.dataValue = dataValue;
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

    public int getMonitorUnitKm() {
        return monitorUnitKm;
    }

    public void setMonitorUnitKm(int monitorUnitKm) {
        this.monitorUnitKm = monitorUnitKm;
    }

    public int getMonitorUnitMeter() {
        return monitorUnitMeter;
    }

    public void setMonitorUnitMeter(int monitorUnitMeter) {
        this.monitorUnitMeter = monitorUnitMeter;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
