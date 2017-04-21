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

}
