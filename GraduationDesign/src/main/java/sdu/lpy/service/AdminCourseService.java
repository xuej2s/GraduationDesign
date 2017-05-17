package sdu.lpy.service;

import java.util.List;

import sdu.lpy.entity.Course;
import sdu.lpy.entity.CourseSelect;
import sdu.lpy.entity.CourseSelectKey;
import sdu.lpy.entity.Vip;

public interface AdminCourseService {
	
	int deleteByPrimaryKey(String courseId);

    int insertSelective(Course record);

    List<Course> getAllCourse();
    
    List<Course> getSelectedCourse(String vipId); 

    int updateByPrimaryKeySelective(Course record);

    int insertSelective(CourseSelect record,String cardType);
    
    List<Vip> showCourseSelectedVips(String courseId);
    
    int deleteByPrimaryKey(CourseSelectKey key);
}
