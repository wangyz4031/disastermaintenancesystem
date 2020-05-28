
package com.bjjw.dmsmaintenanceservice.entity;

public class RainSensorStatusEntity extends StatusEntity
{
    protected int rainSensorCommStatus;
    protected int rainSensorDeviceStatus;
    protected int rainSensorStatus;

    public int getRainSensorCommStatus() {
        return rainSensorCommStatus;
    }

    public void setRainSensorCommStatus(int rainSensorCommStatus) {
        this.rainSensorCommStatus = rainSensorCommStatus;
    }

    public int getRainSensorDeviceStatus() {
        return rainSensorDeviceStatus;
    }

    public void setRainSensorDeviceStatus(int rainSensorDeviceStatus) {
        this.rainSensorDeviceStatus = rainSensorDeviceStatus;
    }

    public int getRainSensorStatus() {
        return rainSensorStatus;
    }

    public void setRainSensorStatus(int rainSensorStatus) {
        this.rainSensorStatus = rainSensorStatus;
    }
}
