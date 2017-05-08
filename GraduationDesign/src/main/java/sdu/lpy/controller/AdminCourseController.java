package sdu.lpy.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.lpy.entity.ActivityManage;
import sdu.lpy.entity.Course;
import sdu.lpy.service.AdminCourseService;
import sdu.lpy.util.WebUtil;

@Controller
@RequestMapping("/admin/")
public class AdminCourseController {

	@Autowired
	private AdminCourseService adminCourseService;

	@RequestMapping("course.do")
	public String course(Model model) {

		List<Course> list = adminCourseService.getAllCourse();
		model.addAttribute("courseList", list);
		return "coursePage";
	}

	@RequestMapping("addcourse.do")
	public String addcourse() {

		return "addCourse";
	}

	@RequestMapping("addCourse.do")
	public String addCourse(Course course, String dateRange) throws ParseException {

		course.setCourseId(WebUtil.autoCreateId());
		Date[] dates = WebUtil.changeDateRangeToDate(dateRange);
		course.setStartTime(dates[0]);
		course.setEndTime(dates[1]);

		adminCourseService.insertSelective(course);

		return "redirect:course.do";
	}

	@RequestMapping("deletecourse.do")
	public String deletecourse(String courseId) {
		adminCourseService.deleteByPrimaryKey(courseId);
		return "redirect:course.do";
	}

	// 跳转到课程修改页面
	@RequestMapping("updatecourse.do")
	public String updatecourse(Course course, Model model) {
		model.addAttribute("a", course);
		String sdateOp = WebUtil.changeDateToString(course.getStartTime());
		String sdateEd = WebUtil.changeDateToString(course.getEndTime());
		String date = sdateOp + " - " + sdateEd;
		model.addAttribute("date", date);
		return "updateCourse";
	}

	// 修改课程
	@RequestMapping("updateCourse.do")
	public String updateAct(Course course, String dateRange) throws ParseException {
		Date[] dates = WebUtil.changeDateRangeToDate(dateRange);
		course.setStartTime(dates[0]);
		course.setEndTime(dates[1]);
		adminCourseService.updateByPrimaryKeySelective(course);
		return "redirect:course.do";
	}

}
