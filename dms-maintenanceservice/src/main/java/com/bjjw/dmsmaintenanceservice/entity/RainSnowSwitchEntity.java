package com.bjjw.dmsmaintenanceservice.entity;

public class RainSnowSwitchEntity {
    private  int rainDataFlag;
    private  int rainSensorFlag;
    private  int snowDataFlag;
    private  int snowSensorFlag;

    public int getRainDataFlag() {
        return rainDataFlag;
    }

    public void setRainDataFlag(int rainDataFlag) {
        this.rainDataFlag = rainDataFlag;
    }

    public int getRainSensorFlag() {
        return rainSensorFlag;
    }

    public void setRainSensorFlag(int rainSensorFlag) {
        this.rainSensorFlag = rainSensorFlag;
    }

    public int getSnowDataFlag() {
        return snowDataFlag;
    }

    public void setSnowDataFlag(int snowDataFlag) {
        this.snowDataFlag = snowDataFlag;
    }

    public int getSnowSensorFlag() {
        return snowSensorFlag;
    }

    public void setSnowSensorFlag(int snowSensorFlag) {
        this.snowSensorFlag = snowSensorFlag;
    }
}
