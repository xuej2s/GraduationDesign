package sdu.lpy.entity;

import java.util.Date;

public class MachineBuyConfig {

	private String machineType;

	private String machineName;

	private String machineBrand;

	private Double machineCost;

	private String machineFeeId;

	private Integer machineCount;

	private Date time;

	private Double sumCost;

	public String getMachineType() {
		return machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getMachineBrand() {
		return machineBrand;
	}

	public void setMachineBrand(String machineBrand) {
		this.machineBrand = machineBrand;
	}

	public Double getMachineCost() {
		return machineCost;
	}

	public void setMachineCost(Double machineCost) {
		this.machineCost = machineCost;
	}

	public String getMachineFeeId() {
		return machineFeeId;
	}

	public void setMachineFeeId(String machineFeeId) {
		this.machineFeeId = machineFeeId;
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
