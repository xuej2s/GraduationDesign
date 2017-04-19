package sdu.lpy.service;

/**
 * 
 * @author liupy
 *	登陆控制
 *	通过前端传递到后台的账号在数据库中查询密码并将密码返回给controller处理
 *
 * @version $id:LoginService.java,v 0.1 2017年4月19日 下午2:49:07 liupy Exp $
 */
public interface LoginService {
	
	String getAdminPwd(String adminAccount);
	
	String getVipPwd(String vipAccount);
}
