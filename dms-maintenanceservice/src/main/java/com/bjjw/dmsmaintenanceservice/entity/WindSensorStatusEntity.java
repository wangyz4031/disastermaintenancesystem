
package com.bjjw.dmsmaintenanceservice.entity;

public class WindSensorStatusEntity extends StatusEntity
{
    protected int windSensor1CommStatus;
    protected int windSensor1DeviceStatus;
    protected int windSensor1Status;
    protected int windSensor2CommStatus;
    protected int windSensor2DeviceStatus;
    protected int windSensor2Status;
    protected int windSensorStatus;

    public int getWindSensor1CommStatus() {
        return windSensor1CommStatus;
    }

    public void setWindSensor1CommStatus(int windSensor1CommStatus) {
        this.windSensor1CommStatus = windSensor1CommStatus;
    }

    public int getWindSensor1DeviceStatus() {
        return windSensor1DeviceStatus;
    }

    public void setWindSensor1DeviceStatus(int windSensor1DeviceStatus) {
        this.windSensor1DeviceStatus = windSensor1DeviceStatus;
    }

    public int getWindSensor1Status() {
        return windSensor1Status;
    }

    public void setWindSensor1Status(int windSensor1Status) {
        this.windSensor1Status = windSensor1Status;
    }

    public int getWindSensor2CommStatus() {
        return windSensor2CommStatus;
    }

    public void setWindSensor2CommStatus(int windSensor2CommStatus) {
        this.windSensor2CommStatus = windSensor2CommStatus;
    }

    public int getWindSensor2DeviceStatus() {
        return windSensor2DeviceStatus;
    }

    public void setWindSensor2DeviceStatus(int windSensor2DeviceStatus) {
        this.windSensor2DeviceStatus = windSensor2DeviceStatus;
    }

    public int getWindSensor2Status() {
        return windSensor2Status;
    }

    public void setWindSensor2Status(int windSensor2Status) {
        this.windSensor2Status = windSensor2Status;
    }

    public int getWindSensorStatus() {
        return windSensorStatus;
    }

    public void setWindSensorStatus(int windSensorStatus) {
        this.windSensorStatus = windSensorStatus;
    }
}
