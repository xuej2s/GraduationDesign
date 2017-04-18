package sdu.lpy.dao;

import sdu.lpy.entity.MachineFee;

public interface MachineFeeMapper {
    int deleteByPrimaryKey(String machineFeeId);

    int insert(MachineFee record);

    int insertSelective(MachineFee record);

    MachineFee selectByPrimaryKey(String machineFeeId);

    int updateByPrimaryKeySelective(MachineFee record);

    int updateByPrimaryKey(MachineFee record);
}