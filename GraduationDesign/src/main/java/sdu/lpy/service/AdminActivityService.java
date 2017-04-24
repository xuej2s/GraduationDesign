package sdu.lpy.service;

import java.util.List;

import sdu.lpy.entity.ActivityManage;

public interface AdminActivityService {
	
	//活动查询
	List<ActivityManage> getActivity();
	
	//活动增加
	int addActivity(ActivityManage activityManage);
	
	//活动修改
	int updateActivity(ActivityManage activityManage);
	
	//活动删除
	int deleteActivity(ActivityManage activityManage);
}
