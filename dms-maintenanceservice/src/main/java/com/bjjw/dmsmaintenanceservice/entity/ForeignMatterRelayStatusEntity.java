package com.bjjw.dmsmaintenanceservice.entity;

public class ForeignMatterRelayStatusEntity extends StatusEntity {
    public int electricGrid1RelayStatus;

    public int electricGrid2RelayStatus;

    public int upTemporaryDriveRelayStatus;

    public int downTemporaryDriveRelayStatus;

    public int remoteResumeRelayStatus;

    public int controlResumeRelayStatus;

    public int electricGrid1RemoteTestRelayStatus;

    public int electricGrid2RemoteTestRelayStatus;

    private int upTrainControlRelayStatus;

    private int downTrainControlRelayStatus;

    private int alarmRelayStatus;

    public int getElectricGrid1RelayStatus() {
        return electricGrid1RelayStatus;
    }

    public void setElectricGrid1RelayStatus(int electricGrid1RelayStatus) {
        this.electricGrid1RelayStatus = electricGrid1RelayStatus;
    }

    public int getElectricGrid2RelayStatus() {
        return electricGrid2RelayStatus;
    }

    public void setElectricGrid2RelayStatus(int electricGrid2RelayStatus) {
        this.electricGrid2RelayStatus = electricGrid2RelayStatus;
    }

    public int getUpTemporaryDriveRelayStatus() {
        return upTemporaryDriveRelayStatus;
    }

    public void setUpTemporaryDriveRelayStatus(int upTemporaryDriveRelayStatus) {
        this.upTemporaryDriveRelayStatus = upTemporaryDriveRelayStatus;
    }

    public int getDownTemporaryDriveRelayStatus() {
        return downTemporaryDriveRelayStatus;
    }

    public void setDownTemporaryDriveRelayStatus(int downTemporaryDriveRelayStatus) {
        this.downTemporaryDriveRelayStatus = downTemporaryDriveRelayStatus;
    }

    public int getRemoteResumeRelayStatus() {
        return remoteResumeRelayStatus;
    }

    public void setRemoteResumeRelayStatus(int remoteResumeRelayStatus) {
        this.remoteResumeRelayStatus = remoteResumeRelayStatus;
    }

    public int getControlResumeRelayStatus() {
        return controlResumeRelayStatus;
    }

    public void setControlResumeRelayStatus(int controlResumeRelayStatus) {
        this.controlResumeRelayStatus = controlResumeRelayStatus;
    }

    public int getElectricGrid1RemoteTestRelayStatus() {
        return electricGrid1RemoteTestRelayStatus;
    }

    public void setElectricGrid1RemoteTestRelayStatus(int electricGrid1RemoteTestRelayStatus) {
        this.electricGrid1RemoteTestRelayStatus = electricGrid1RemoteTestRelayStatus;
    }

    public int getElectricGrid2RemoteTestRelayStatus() {
        return electricGrid2RemoteTestRelayStatus;
    }

    public void setElectricGrid2RemoteTestRelayStatus(int electricGrid2RemoteTestRelayStatus) {
        this.electricGrid2RemoteTestRelayStatus = electricGrid2RemoteTestRelayStatus;
    }

    public int getUpTrainControlRelayStatus() {
        return upTrainControlRelayStatus;
    }

    public void setUpTrainControlRelayStatus(int upTrainControlRelayStatus) {
        this.upTrainControlRelayStatus = upTrainControlRelayStatus;
    }

    public int getDownTrainControlRelayStatus() {
        return downTrainControlRelayStatus;
    }

    public void setDownTrainControlRelayStatus(int downTrainControlRelayStatus) {
        this.downTrainControlRelayStatus = downTrainControlRelayStatus;
    }

    public int getAlarmRelayStatus() {
        return alarmRelayStatus;
    }

    public void setAlarmRelayStatus(int alarmRelayStatus) {
        this.alarmRelayStatus = alarmRelayStatus;
    }
}
