package sdu.lpy.dao;

import java.util.List;

import sdu.lpy.entity.ActivityManage;

public interface ActivityManageMapper {
    

	ActivityManage selectByPrimaryKey(String activityId);


	int updateByPrimaryKey(ActivityManage record);

	int insert(ActivityManage record);
    
    //添加活动
    int insertSelective(ActivityManage record);
    
    //展示活动
    List<ActivityManage> getActivity();
    
    //修改活动
    int updateActivity(ActivityManage activityManage);
    
    //删除活动
    int deleteActivity(ActivityManage activityManage);
}