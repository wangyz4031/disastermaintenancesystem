
package com.bjjw.dmsmaintenanceservice.entity;
public class SnowSensorStatusEntity extends StatusEntity
{
    protected int snowSensorCommStatus;
    protected int snowSensorDeviceStatus;
    protected int snowSensorStatus;

    public int getSnowSensorCommStatus() {
        return snowSensorCommStatus;
    }

    public void setSnowSensorCommStatus(int snowSensorCommStatus) {
        this.snowSensorCommStatus = snowSensorCommStatus;
    }

    public int getSnowSensorDeviceStatus() {
        return snowSensorDeviceStatus;
    }

    public void setSnowSensorDeviceStatus(int snowSensorDeviceStatus) {
        this.snowSensorDeviceStatus = snowSensorDeviceStatus;
    }

    public int getSnowSensorStatus() {
        return snowSensorStatus;
    }

    public void setSnowSensorStatus(int snowSensorStatus) {
        this.snowSensorStatus = snowSensorStatus;
    }
}
