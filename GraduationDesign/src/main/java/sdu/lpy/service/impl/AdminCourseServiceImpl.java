package sdu.lpy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdu.lpy.dao.CourseMapper;
import sdu.lpy.entity.Course;
import sdu.lpy.service.AdminCourseService;

@Service("adminCourseService")
public class AdminCourseServiceImpl implements AdminCourseService {

	@Autowired
	private CourseMapper courseMapper;
	
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

}
