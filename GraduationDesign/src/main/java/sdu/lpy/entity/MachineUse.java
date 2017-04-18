package sdu.lpy.entity;

import java.util.Date;

public class MachineUse {
    private String machineId;

    private String vipId;

    private Date startTime;

    private Date endTime;

    private Integer costTime;

    private Double calorieCost;

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId == null ? null : machineId.trim();
    }

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId == null ? null : vipId.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    public Double getCalorieCost() {
        return calorieCost;
    }

    public void setCalorieCost(Double calorieCost) {
        this.calorieCost = calorieCost;
    }
}