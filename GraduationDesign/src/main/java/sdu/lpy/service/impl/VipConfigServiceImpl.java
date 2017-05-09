package sdu.lpy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdu.lpy.dao.VipMapper;
import sdu.lpy.entity.Vip;
import sdu.lpy.service.VipConfigService;

@Service("vipConfigService")
public class VipConfigServiceImpl implements VipConfigService {

	@Autowired
	private VipMapper vipMapper;
	
	public Vip getVip(String vipId) {
		// TODO Auto-generated method stub
		return vipMapper.selectByPrimaryKey(vipId);
	}

	public int updatePw(String oldPw, String newPw, String vipId) {
		// TODO Auto-generated method stub
		Vip vip = vipMapper.selectByPrimaryKey(vipId);
		int a = 0;
		if (oldPw.equals(vip.getVipPassword())) {
			a = vipMapper.updatePw(vipId, newPw);
		}
		return a;
	}

}
