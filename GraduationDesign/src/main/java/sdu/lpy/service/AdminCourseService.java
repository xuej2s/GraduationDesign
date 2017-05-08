package sdu.lpy.service;

import java.util.List;

import sdu.lpy.entity.Course;

public interface AdminCourseService {
	
	int deleteByPrimaryKey(String courseId);

    int insertSelective(Course record);

    List<Course> getAllCourse();

    int updateByPrimaryKeySelective(Course record);

}
