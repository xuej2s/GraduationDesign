package sdu.lpy.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdu.lpy.dao.ActivityManageMapper;
import sdu.lpy.dao.CourseMapper;
import sdu.lpy.dao.CourseSelectMapper;
import sdu.lpy.entity.ActivityManage;
import sdu.lpy.entity.Course;
import sdu.lpy.entity.CourseSelect;
import sdu.lpy.service.AdminCourseService;

@Service("adminCourseService")
public class AdminCourseServiceImpl implements AdminCourseService {

	@Autowired
	private CourseMapper courseMapper;
	
	@Autowired
	private ActivityManageMapper activityManageMapper;
	
	@Autowired
	private CourseSelectMapper courseSelectMapper;
	
	public int deleteByPrimaryKey(String courseId) {
		// TODO Auto-generated method stub
		
		return courseMapper.deleteByPrimaryKey(courseId);
	}

	public int insertSelective(Course record) {
		// TODO Auto-generated method stub
		return courseMapper.insertSelective(record);
	}

	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseMapper.getAllCourse();
	}

	public int updateByPrimaryKeySelective(Course record) {
		// TODO Auto-generated method stub
		return courseMapper.updateByPrimaryKey(record);
	}

	public int insertSelective(CourseSelect record,String cardType) {
		// TODO Auto-generated method stub
		Date date = new Date();
		record.setSelectTime(date);
		List<ActivityManage> activityManages = activityManageMapper.selectByDate(date);
		double discount = 1;
		//判断是否有活动优惠
		if (activityManages.size() > 0) {
			
			for (int i = 0; i < activityManages.size(); i++) {
				String actObj = activityManages.get(i).getActivityObj();
				String actCardType = activityManages.get(i).getCardType();
				if (actObj == "0" || actObj == "2") {
					if (actCardType == "0" || actCardType == cardType) {
						discount = activityManages.get(i).getDiscount();
						break;
					}else {
						activityManages.remove(i);
					}
				}else {
					activityManages.remove(i);
				}
			}
		}
		
		
			
			double cost = record.getCourseCost();
			
			double cost1 = cost * discount;
			System.out.println(cost1+"11111111111");
			record.setCourseCost(cost1);
			return courseSelectMapper.insertSelective(record);
		
	}

	public List<Course> getSelectedCourse(String vipId) {
		// TODO Auto-generated method stub
		List<Course> courses = new ArrayList<Course>();
		List<CourseSelect> courseSelects = courseSelectMapper.getSelectedCourses(vipId);
		
		for (int i = 0; i < courseSelects.size(); i++) {
			Course course = courseMapper.selectByPrimaryKey(courseSelects.get(i).getCourseId());
			courses.add(course);
		}
		return courses;
	}

	

}
