package sdu.lpy.entity;

public class MachineConfig {
    private String machineType;

    private String machineName;

    private String machineBrand;

    private Double machineCost;

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType == null ? null : machineType.trim();
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName == null ? null : machineName.trim();
    }

    public String getMachineBrand() {
        return machineBrand;
    }

    public void setMachineBrand(String machineBrand) {
        this.machineBrand = machineBrand == null ? null : machineBrand.trim();
    }

    public Double getMachineCost() {
        return machineCost;
    }

    public void setMachineCost(Double machineCost) {
        this.machineCost = machineCost;
    }
}