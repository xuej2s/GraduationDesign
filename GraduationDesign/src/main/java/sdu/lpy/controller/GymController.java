package sdu.lpy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GymController {

	@RequestMapping("/showConfig.do")
	public String page1(){
		return "page1";
	}
}
