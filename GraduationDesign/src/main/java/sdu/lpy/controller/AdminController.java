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
	
	//活动页面数据展示
	@RequestMapping("activity.do")
	public String activity(Model model,HttpServletRequest request){
		List<ActivityManage> activityList = adminActivityService.getActivity();
		model.addAttribute("activityList", activityList);
		return "activityPage";
	}
	
	//跳转到活动增加页面
	@RequestMapping("addactivity.do")
	public String addActivity(){
		return "addActivity";
	}
	
	//活动增加
	@RequestMapping("addActivity.do")
	public String addAct(ActivityManage activityManage,String dateRange){
		System.out.println(dateRange);
		return "";
	}
	
	//跳转到活动修改页面
	@RequestMapping("updateactivity.do")
	public String updateActivity(ActivityManage activityManage,Model model){
		model.addAttribute("a", activityManage);
		String date = "04/29/2017 - 05/08/2017";
		model.addAttribute("date", date);
		return "updateActivity";
	}
	
	//删除活动
	@RequestMapping("deleteactivity.do")
	public String deleteActivity(ActivityManage activityManage){
		return "";
	}
	
	
	
	
	
}
