package sdu.lpy.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import sdu.lpy.entity.CourseProfit;
import sdu.lpy.entity.CourseSelect;
import sdu.lpy.entity.CourseSelectKey;
import sdu.lpy.entity.TestGroup;

public interface CourseSelectMapper {
    int deleteByPrimaryKey(CourseSelectKey key);

    int insert(CourseSelect record);

    int insertSelective(CourseSelect record);

    CourseSelect selectByPrimaryKey(CourseSelectKey key);

    int updateByPrimaryKeySelective(CourseSelect record);

    int updateByPrimaryKey(CourseSelect record);
    
    List<CourseSelect> getSelectedCourses(String vipId);
    
    List<CourseSelect> getCourseSelectedVips(String courseId);
    
    List<TestGroup> testGroupBy();
    
    List<CourseProfit> getCourseProfit(Date startTime,Date endTime);
    
}