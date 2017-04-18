package sdu.lpy.dao;

import sdu.lpy.entity.CourseSelect;

public interface CourseSelectMapper {
    int deleteByPrimaryKey(String courseId);

    int insert(CourseSelect record);

    int insertSelective(CourseSelect record);

    CourseSelect selectByPrimaryKey(String courseId);

    int updateByPrimaryKeySelective(CourseSelect record);

    int updateByPrimaryKey(CourseSelect record);
}