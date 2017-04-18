package sdu.lpy.dao;

import sdu.lpy.entity.MachineUse;

public interface MachineUseMapper {
    int deleteByPrimaryKey(String machineId);

    int insert(MachineUse record);

    int insertSelective(MachineUse record);

    MachineUse selectByPrimaryKey(String machineId);

    int updateByPrimaryKeySelective(MachineUse record);

    int updateByPrimaryKey(MachineUse record);
}