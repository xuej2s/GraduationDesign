package sdu.lpy.dao;

import java.util.List;

import sdu.lpy.entity.News;

public interface NewsMapper {
	int insert(News record);
    
	int deleteByPrimaryKey(String newId);


    int insertSelective(News record);

    News selectByPrimaryKey(String newId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
    List<News> getNews();
}