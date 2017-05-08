package sdu.lpy.dao;

import sdu.lpy.entity.Machine;

public interface MachineMapper {
    int deleteByPrimaryKey(String machineId);

    int insert(Machine record);

    int insertSelective(Machine record);

    Machine selectByPrimaryKey(String machineId);

    int updateByPrimaryKeySelective(Machine record);

    int updateByPrimaryKey(Machine record);
    
    int deleteByMachineType(String machineType);
}