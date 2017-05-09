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

}
