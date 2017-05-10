package sdu.lpy.service;

import java.util.List;

import sdu.lpy.entity.Vip;

public interface VipConfigService {
	
	Vip getVip(String vipId);
	
	int updatePw(String oldPw,String newPw,String vipId);
	
	List<Vip> getAllVips();
	
	int insertSelective(Vip record);
	
	int deleteByPrimaryKey(String vipId);
	
}
