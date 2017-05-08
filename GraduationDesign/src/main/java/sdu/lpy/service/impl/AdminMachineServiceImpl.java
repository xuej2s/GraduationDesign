package sdu.lpy.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdu.lpy.dao.MachineConfigMapper;
import sdu.lpy.dao.MachineFeeMapper;
import sdu.lpy.dao.MachineMapper;
import sdu.lpy.entity.Machine;
import sdu.lpy.entity.MachineBuyConfig;
import sdu.lpy.entity.MachineConfig;
import sdu.lpy.entity.MachineFee;
import sdu.lpy.service.AdminMachineService;
import sdu.lpy.util.WebUtil;

@Service("adminMachineService")
public class AdminMachineServiceImpl implements AdminMachineService {

	@Autowired
	private MachineMapper machineMapper;

	@Autowired
	private MachineConfigMapper machineConfigMapper;

	@Autowired
	private MachineFeeMapper machineFeeMapper;

	public int addMachine(MachineConfig machineConfig, MachineFee machineFee) {
		// TODO Auto-generated method stub
		int count = machineFee.getMachineCount();

		String machineType = WebUtil.autoCreateId();
		machineConfig.setMachineType(machineType);
		machineFee.setMachineFeeId(machineType);
		machineFee.setMachineType(machineType);
		machineFee.setTime(new Date());
		double machineCost = machineConfig.getMachineCost();
		
		machineFee.setSumCost(machineCost * count);
		
		Machine machine = new Machine();
		for (int i = 0; i < count; i++) {
			machine.setMachineId(WebUtil.autoCreateId());
			machine.setMachineType(machineType);
			machineMapper.insertSelective(machine);
		}

		int b = machineConfigMapper.insertSelective(machineConfig);
		int c = machineFeeMapper.insertSelective(machineFee);
		return b + c;
	}

	public int deleteMachine(String machineType) {
		// TODO Auto-generated method stub
		int a = machineConfigMapper.deleteByPrimaryKey(machineType);
		int b = machineFeeMapper.deleteByPrimaryKey(machineType);
		int c = machineMapper.deleteByMachineType(machineType);
		return a + b + c;
	}

	public List<MachineBuyConfig> getAllMachine() {
		// TODO Auto-generated method stub
		List<MachineBuyConfig> list = machineConfigMapper.getAllMachine();
		return list;
	}

}
