package sdu.lpy.dao;

import java.util.List;

import sdu.lpy.entity.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(String courseId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String courseId);
    
    List<Course> getAllCourse();

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}