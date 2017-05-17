package sdu.lpy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.lpy.entity.Course;
import sdu.lpy.entity.CourseSelect;
import sdu.lpy.service.AdminCourseService;

@Controller
@RequestMapping("/vip/")
public class VipCourseController {

	@Autowired
	private AdminCourseService adminCourseService;
	
	//查看课程
	@RequestMapping("course.do")
	public String course(Model model,HttpServletRequest request){
		List<Course> courses = adminCourseService.getAllCourse();
		model.addAttribute("courseList", courses);
		String vipId = (String) request.getSession().getAttribute("vipId");
		model.addAttribute("vipId", vipId);
		return "vCoursePage";
	}
	
	//选课
	@RequestMapping("courseselected.do")
	public String courseselected(CourseSelect courseSelect,String cardType){
		adminCourseService.insertSelective(courseSelect,cardType);
		return "redirect:vipconfig.do";
	}
	
	
}
