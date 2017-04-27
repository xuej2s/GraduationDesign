package sdu.lpy.service;

import java.util.List;

import sdu.lpy.entity.News;

public interface AdminNewsService {
	int deleteByPrimaryKey(String newId);

	int insertSelective(News record);

	News selectByPrimaryKey(String newId);

	int updateByPrimaryKeySelective(News record);

	List<News> getNews();
}
