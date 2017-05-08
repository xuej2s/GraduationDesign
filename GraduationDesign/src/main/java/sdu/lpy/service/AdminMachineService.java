package sdu.lpy.service;

import java.util.List;

import sdu.lpy.entity.Machine;
import sdu.lpy.entity.MachineBuyConfig;
import sdu.lpy.entity.MachineConfig;
import sdu.lpy.entity.MachineFee;

public interface AdminMachineService {

	int addMachine(MachineConfig machineConfig,MachineFee machineFee);
	
	int deleteMachine(String machineType);
	
	List<MachineBuyConfig> getAllMachine();
}
