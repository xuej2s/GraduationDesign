package sdu.lpy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping("/a.do")
	public String test(){
		return "login";
	}
	
	@RequestMapping("/managers.do")
	public String login(String inputEmail,String inputPassword){

		System.out.println(inputEmail+":"+inputPassword);
		if (inputPassword.equals("123456")) {
			System.out.println("---------");
			return "page1";
		} else {
			System.out.println("++++++++++");
			return "login";
		}
		
	}
}
