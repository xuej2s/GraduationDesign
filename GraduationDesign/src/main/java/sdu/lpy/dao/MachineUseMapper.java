package sdu.lpy.dao;

import sdu.lpy.entity.MachineUse;

public interface MachineUseMapper {
    int deleteByPrimaryKey(String machineUseId);

    int insert(MachineUse record);

    int insertSelective(MachineUse record);

    MachineUse selectByPrimaryKey(String machineUseId);

    int updateByPrimaryKeySelective(MachineUse record);

    int updateByPrimaryKey(MachineUse record);
}