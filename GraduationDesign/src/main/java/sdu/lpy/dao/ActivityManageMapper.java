package sdu.lpy.dao;

import sdu.lpy.entity.ActivityManage;

public interface ActivityManageMapper {
    int insert(ActivityManage record);

    int insertSelective(ActivityManage record);
}