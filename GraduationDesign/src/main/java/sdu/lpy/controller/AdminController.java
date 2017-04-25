package sdu.lpy.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.lpy.entity.ActivityManage;
import sdu.lpy.service.AdminActivityService;
import sdu.lpy.util.WebUtil;

@Controller
@RequestMapping("/admin/")
public class AdminController {

	@Autowired
	private AdminActivityService adminActivityService;

	// 活动页面数据展示
	@RequestMapping("activity.do")
	public String activity(Model model, HttpServletRequest request) {
		List<ActivityManage> activityList = adminActivityService.getActivity();
		model.addAttribute("activityList", activityList);
		return "activityPage";
	}

	// 跳转到活动增加页面
	@RequestMapping("addactivity.do")
	public String addActivity() {
		return "addActivity";
	}

	// 活动增加
	@RequestMapping("addActivity.do")
	public String addAct(ActivityManage activityManage, String dateRange,HttpServletResponse response,Model model) throws ParseException, IOException {
		activityManage.setActivityId(WebUtil.autoCreateId());
		
		Date[] dates = WebUtil.changeDateRangeToDate(dateRange);
		activityManage.setStartTime(dates[0]);
		activityManage.setEndTime(dates[1]);
		if (adminActivityService.addActivity(activityManage) == 1) {
			response.getWriter().write("<script language='javascript'>alert('添加成功');window.close();</script>");
			return "redirect:activity.do";
		} else {
			response.getWriter().write("<script language='javascript'>alert('添加失败');window.close();</script>");
			return "addActivity";
		}
	}

	// 跳转到活动修改页面
	@RequestMapping("updateactivity.do")
	public String updateActivity(ActivityManage activityManage, Model model) {
		model.addAttribute("a", activityManage);
		String sdateOp = WebUtil.changeDateToString(activityManage.getStartTime());
		String sdateEd = WebUtil.changeDateToString(activityManage.getEndTime());
		String date = sdateOp + " - " + sdateEd;
		model.addAttribute("date", date);
		return "updateActivity";
	}
	
	//修改活动
	@RequestMapping("updateActivity.do")
	public String updateAct(ActivityManage activityManage,String dateRange) throws ParseException{
		Date[] dates = WebUtil.changeDateRangeToDate(dateRange);
		activityManage.setStartTime(dates[0]);
		activityManage.setEndTime(dates[1]);
		adminActivityService.updateActivity(activityManage);
		return "redirect:activity.do";
	}

	// 删除活动
	@RequestMapping("deleteactivity.do")
	public String deleteActivity(ActivityManage activityManage) {
		adminActivityService.deleteActivity(activityManage); 
		
		return "redirect:activity.do";
		
	}

}
