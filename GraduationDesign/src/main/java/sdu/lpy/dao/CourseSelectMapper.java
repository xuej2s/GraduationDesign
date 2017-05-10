package sdu.lpy.dao;

import java.util.List;

import sdu.lpy.entity.CourseSelect;
import sdu.lpy.entity.CourseSelectKey;

public interface CourseSelectMapper {
    int deleteByPrimaryKey(CourseSelectKey key);

    int insert(CourseSelect record);

    int insertSelective(CourseSelect record);

    CourseSelect selectByPrimaryKey(CourseSelectKey key);

    int updateByPrimaryKeySelective(CourseSelect record);

    int updateByPrimaryKey(CourseSelect record);
    
    List<CourseSelect> getSelectedCourses(String vipId);
    
    List<CourseSelect> getCourseSelectedVips(String courseId);
}