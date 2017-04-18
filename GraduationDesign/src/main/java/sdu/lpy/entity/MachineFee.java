package sdu.lpy.entity;

import java.util.Date;

public class MachineFee {
    private String machineFeeId;

    private String machineType;

    private Integer machineCount;

    private Date time;

    private Double sumCost;

    public String getMachineFeeId() {
        return machineFeeId;
    }

    public void setMachineFeeId(String machineFeeId) {
        this.machineFeeId = machineFeeId == null ? null : machineFeeId.trim();
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType == null ? null : machineType.trim();
    }

    public Integer getMachineCount() {
        return machineCount;
    }

    public void setMachineCount(Integer machineCount) {
        this.machineCount = machineCount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getSumCost() {
        return sumCost;
    }

    public void setSumCost(Double sumCost) {
        this.sumCost = sumCost;
    }
}