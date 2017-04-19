package sdu.lpy.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdu.lpy.dao.AdminMapper;
import sdu.lpy.dao.VipMapper;
import sdu.lpy.entity.Admin;
import sdu.lpy.entity.Vip;
import sdu.lpy.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AdminMapper adminMapper;
	
	@Autowired
	private VipMapper vipMapper;
	
	
	public String getAdminPwd(String adminAccount) {
		// TODO Auto-generated method stub
		Admin admin = adminMapper.selectByPrimaryKey(adminAccount);
		if (admin == null) {
			return null;
		} else {
			
			return admin.getPassword();
		}
	}

	public String getVipPwd(String vipAccount) {
		// TODO Auto-generated method stub
		Vip vip = vipMapper.selectByPrimaryKey(vipAccount);
		if (vip == null) {
			return null;
		}else {
			
			return vip.getVipPassword();
		}
	}

}
