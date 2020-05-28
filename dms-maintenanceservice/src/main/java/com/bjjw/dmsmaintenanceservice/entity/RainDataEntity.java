
package com.bjjw.dmsmaintenanceservice.entity;
public class RainDataEntity extends DataEntity
{
    protected double continuousRainfall;
    protected double cumulativeRainfall;
    protected double dayRainfall;
    protected double hourRainfall;
    protected double minuteRainfall;
    protected double rainfallIntensity;
    protected double tenMinuteRainfall;

    public double getContinuousRainfall() {
        return continuousRainfall;
    }

    public void setContinuousRainfall(double continuousRainfall) {
        this.continuousRainfall = continuousRainfall;
    }

    public double getCumulativeRainfall() {
        return cumulativeRainfall;
    }

    public void setCumulativeRainfall(double cumulativeRainfall) {
        this.cumulativeRainfall = cumulativeRainfall;
    }

    public double getDayRainfall() {
        return dayRainfall;
    }

    public void setDayRainfall(double dayRainfall) {
        this.dayRainfall = dayRainfall;
    }

    public double getHourRainfall() {
        return hourRainfall;
    }

    public void setHourRainfall(double hourRainfall) {
        this.hourRainfall = hourRainfall;
    }

    public double getMinuteRainfall() {
        return minuteRainfall;
    }

    public void setMinuteRainfall(double minuteRainfall) {
        this.minuteRainfall = minuteRainfall;
    }

    public double getRainfallIntensity() {
        return rainfallIntensity;
    }

    public void setRainfallIntensity(double rainfallIntensity) {
        this.rainfallIntensity = rainfallIntensity;
    }

    public double getTenMinuteRainfall() {
        return tenMinuteRainfall;
    }

    public void setTenMinuteRainfall(double tenMinuteRainfall) {
        this.tenMinuteRainfall = tenMinuteRainfall;
    }
}
