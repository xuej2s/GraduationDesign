package sdu.lpy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.lpy.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/admin.do")
	public String adminLogin() {
	
		return "login";
	
	}

	@RequestMapping("/ahomepage.do")
	public String aLogin(String inputEmail, String inputPassword) {

		if (inputPassword.equals(loginService.getAdminPwd(inputEmail))) {
		
			return "homePage";
		
		} else {
		
			return "login";
		
		}

	}
	
	@RequestMapping("/vip.do")
	public String vipLogin(){
		
		return "";
	
	}
	
	@RequestMapping("/vhomepage.do")
	public String vLogin(String vipAccount, String vipPwd ){
		return "";
	}
	
}
