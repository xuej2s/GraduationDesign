package sdu.lpy.dao;

import java.util.List;

import sdu.lpy.entity.ActivityManage;

public interface ActivityManageMapper {
    int insert(ActivityManage record);

    int insertSelective(ActivityManage record);
    
    List<ActivityManage> getActivity();
}