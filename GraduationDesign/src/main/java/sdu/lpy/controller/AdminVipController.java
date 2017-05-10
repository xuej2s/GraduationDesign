package sdu.lpy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.lpy.entity.ActivityManage;
import sdu.lpy.entity.Course;
import sdu.lpy.entity.Vip;
import sdu.lpy.service.AdminCourseService;
import sdu.lpy.service.VipConfigService;

@Controller
@RequestMapping("/admin/")
public class AdminVipController {

	@Autowired
	private VipConfigService vipConfigService;

	@Autowired
	private AdminCourseService adminCourseService;

	@RequestMapping("vip.do")
	public String vip(Model model) {
		List<Vip> vips = vipConfigService.getAllVips();
		model.addAttribute("vips", vips);

		return "vipPage";
	}

	@RequestMapping("showvip.do")
	public String showvip(String vipId, Model model) {

		Vip vip = vipConfigService.getVip(vipId);
		List<Course> courses = adminCourseService.getSelectedCourse(vipId);

		model.addAttribute("vip", vip);
		model.addAttribute("courseList", courses);
		return "vConfigPage";
	}

	@RequestMapping("addvip.do")
	public String addvip() {

		return "addVip";
	}

	@RequestMapping("addVip.do")
	public String addVip(Vip vip) {
		vipConfigService.insertSelective(vip);
		return "redirect:vip.do";
	}

	@RequestMapping("deletevip.do")
	public String deletevip(String vipId) {
		
		vipConfigService.deleteByPrimaryKey(vipId);
		return "redirect:activity.do";

	}
}
