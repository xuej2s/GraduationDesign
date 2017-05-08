package sdu.lpy.dao;

import java.util.List;

import sdu.lpy.entity.MachineBuyConfig;
import sdu.lpy.entity.MachineConfig;

public interface MachineConfigMapper {
	int deleteByPrimaryKey(String machineType);

	int insert(MachineConfig record);

	int insertSelective(MachineConfig record);

	MachineConfig selectByPrimaryKey(String machineType);

	int updateByPrimaryKeySelective(MachineConfig record);

	int updateByPrimaryKey(MachineConfig record);

	List<MachineBuyConfig> getAllMachine();
}