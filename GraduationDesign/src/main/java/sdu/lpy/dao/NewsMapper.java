package sdu.lpy.dao;

import sdu.lpy.entity.News;

public interface NewsMapper {
    int deleteByPrimaryKey(String newsName);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(String newsName);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}