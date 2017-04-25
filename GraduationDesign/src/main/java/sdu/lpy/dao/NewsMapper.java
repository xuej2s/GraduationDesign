package sdu.lpy.dao;

import sdu.lpy.entity.News;

public interface NewsMapper {
    int deleteByPrimaryKey(String newId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(String newId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}