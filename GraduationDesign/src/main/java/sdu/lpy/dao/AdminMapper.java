package sdu.lpy.dao;

import sdu.lpy.entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(String adminAccount);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String adminAccount);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}