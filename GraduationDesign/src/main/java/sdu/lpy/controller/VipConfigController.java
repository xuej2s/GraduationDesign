package sdu.lpy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.lpy.entity.Course;
import sdu.lpy.entity.Vip;
import sdu.lpy.service.AdminCourseService;
import sdu.lpy.service.VipConfigService;

@Controller
@RequestMapping("/vip/")
public class VipConfigController {

	@Autowired
	private VipConfigService vipConfigService;
	
	@Autowired
	private AdminCourseService adminCourseService;
	
	@RequestMapping("vipconfig.do")
	public String vipconfig(Model model,HttpServletRequest request){
		
		String vipId = (String)request.getSession().getAttribute("vipId");
		
		Vip vip = vipConfigService.getVip(vipId);
		List<Course> courses = adminCourseService.getSelectedCourse(vipId);
		
		model.addAttribute("vip", vip);
		model.addAttribute("courseList", courses);
		return "vConfigPage";
	}
}
