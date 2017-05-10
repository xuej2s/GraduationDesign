package sdu.lpy.dao;

import java.util.List;

import sdu.lpy.entity.Vip;

public interface VipMapper {
    int deleteByPrimaryKey(String vipId);

    int insert(Vip record);

    int insertSelective(Vip record);

    Vip selectByPrimaryKey(String vipId);
    
    List<Vip> getAllVips();

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);
    
    int updatePw(String vipId,String newPw);
}