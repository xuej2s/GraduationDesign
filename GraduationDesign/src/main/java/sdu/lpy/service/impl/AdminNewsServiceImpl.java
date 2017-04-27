package sdu.lpy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdu.lpy.dao.NewsMapper;
import sdu.lpy.entity.News;
import sdu.lpy.service.AdminNewsService;

@Service("adminNewsService")
public class AdminNewsServiceImpl implements AdminNewsService {

	@Autowired
	private NewsMapper newsMapper;
	
	public int deleteByPrimaryKey(String newId) {
		// TODO Auto-generated method stub
		return newsMapper.deleteByPrimaryKey(newId);
	}

	public int insertSelective(News record) {
		// TODO Auto-generated method stub
		return newsMapper.insertSelective(record);
	}

	public News selectByPrimaryKey(String newId) {
		// TODO Auto-generated method stub
		return newsMapper.selectByPrimaryKey(newId);
	}

	public int updateByPrimaryKeySelective(News record) {
		// TODO Auto-generated method stub
		return newsMapper.updateByPrimaryKey(record);
	}

	public List<News> getNews() {
		// TODO Auto-generated method stub
		return newsMapper.getNews();
	}

}
