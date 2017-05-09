package sdu.lpy.service;

import sdu.lpy.entity.Vip;

public interface VipConfigService {
	
	Vip getVip(String vipId);
	
	int updatePw(String oldPw,String newPw,String vipId);
	
}
