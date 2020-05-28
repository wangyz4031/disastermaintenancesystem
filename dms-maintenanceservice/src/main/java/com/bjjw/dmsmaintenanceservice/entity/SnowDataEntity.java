
package com.bjjw.dmsmaintenanceservice.entity;

public class SnowDataEntity extends DataEntity
{
    protected double actualSnowDepth;
    protected double benchMarkSnowDepth;
    protected double snowDepth;

    public double getActualSnowDepth() {
        return actualSnowDepth;
    }

    public void setActualSnowDepth(double actualSnowDepth) {
        this.actualSnowDepth = actualSnowDepth;
    }

    public double getBenchMarkSnowDepth() {
        return benchMarkSnowDepth;
    }

    public void setBenchMarkSnowDepth(double benchMarkSnowDepth) {
        this.benchMarkSnowDepth = benchMarkSnowDepth;
    }

    public double getSnowDepth() {
        return snowDepth;
    }

    public void setSnowDepth(double snowDepth) {
        this.snowDepth = snowDepth;
    }
}
