package sdu.lpy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdu.lpy.dao.ActivityManageMapper;
import sdu.lpy.entity.ActivityManage;
import sdu.lpy.service.AdminActivityService;

@Service("adminActivityService")
public class AdminActivityServiceImpl implements AdminActivityService {

	@Autowired
	private ActivityManageMapper activityManageMapper;
	
	//返回所有活动信息
	public List<ActivityManage> getActivity() {
		// TODO Auto-generated method stub
		return activityManageMapper.getActivity();
	}
	
	//添加活动
	public int addActivity(ActivityManage activityManage) {
		// TODO Auto-generated method stub
		return activityManageMapper.insertSelective(activityManage);
	}
	
	//修改活动
	public int updateActivity(ActivityManage activityManage) {
		// TODO Auto-generated method stub
		return activityManageMapper.updateActivity(activityManage);
	}
	
	//删除活动
	public int deleteActivity(ActivityManage activityManage) {
		// TODO Auto-generated method stub
		return activityManageMapper.deleteActivity(activityManage);
	}

}
