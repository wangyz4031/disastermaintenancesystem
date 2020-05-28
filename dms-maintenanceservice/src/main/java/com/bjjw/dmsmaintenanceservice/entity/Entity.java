
package com.bjjw.dmsmaintenanceservice.entity;

public class Entity {
    protected String bureauCode;
    protected String id;
    protected String lineCode;
    protected String lineName;
    protected String monitorPointCode;
    protected String monitorUnitCode;
    protected String monitoringTime;
    protected String writeToDbTimeStamp;


    public String getBureauCode() {
        return bureauCode;
    }

    public void setBureauCode(String bureauCode) {
        this.bureauCode = bureauCode;
    }

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

    public String getMonitorPointCode() {
        return monitorPointCode;
    }

    public void setMonitorPointCode(String monitorPointCode) {
        this.monitorPointCode = monitorPointCode;
    }

    public String getMonitorUnitCode() {
        return monitorUnitCode;
    }

    public void setMonitorUnitCode(String monitorUnitCode) {
        this.monitorUnitCode = monitorUnitCode;
    }

    public String getMonitoringTime() {
        return monitoringTime;
    }

    public void setMonitoringTime(String monitoringTime) {
        this.monitoringTime = monitoringTime;
    }

    public String getWriteToDbTimeStamp() {
        return writeToDbTimeStamp;
    }

    public void setWriteToDbTimeStamp(String writeToDbTimeStamp) {
        this.writeToDbTimeStamp = writeToDbTimeStamp;
    }
}
