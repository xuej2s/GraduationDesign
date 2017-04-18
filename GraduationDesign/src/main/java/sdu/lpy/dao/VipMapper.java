package sdu.lpy.dao;

import sdu.lpy.entity.Vip;

public interface VipMapper {
    int deleteByPrimaryKey(String vipId);

    int insert(Vip record);

    int insertSelective(Vip record);

    Vip selectByPrimaryKey(String vipId);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);
}