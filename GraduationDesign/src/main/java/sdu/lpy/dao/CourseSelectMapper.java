package sdu.lpy.dao;

import sdu.lpy.entity.CourseSelect;
import sdu.lpy.entity.CourseSelectKey;

public interface CourseSelectMapper {
    int deleteByPrimaryKey(CourseSelectKey key);

    int insert(CourseSelect record);

    int insertSelective(CourseSelect record);

    CourseSelect selectByPrimaryKey(CourseSelectKey key);

    int updateByPrimaryKeySelective(CourseSelect record);

    int updateByPrimaryKey(CourseSelect record);
}