package sdu.lpy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.lpy.entity.ActivityManage;
import sdu.lpy.service.AdminActivityService;

@Controller
@RequestMapping("/admin/")
public class AdminController {

	@Autowired
	private AdminActivityService adminActivityService;
	
	
	@RequestMapping("activity.do")
	public String activity(Model model,HttpServletRequest request){
		List<ActivityManage> activityList = adminActivityService.getActivity();
		model.addAttribute("activityList", activityList);
		return "activityPage";
	}
	
	
}
