package sdu.lpy.controller;

import java.text.ParseException;
import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.abel533.echarts.json.GsonOption;
import sdu.lpy.service.ProfitChartService;
import sdu.lpy.util.WebUtil;

@Controller
@RequestMapping("/admin/")
public class TestEchart {

	@Autowired
	private ProfitChartService profitChartService;
	
	@RequestMapping("chart.do")
	public String test(Model model,String dateRange) throws ParseException {
		//		model.addAttribute("option", gsonOption.toString());
		if (dateRange != null) {
			
			Date[] dates = WebUtil.changeDateRangeToDate(dateRange);
			Date startTime = dates[0];
			Date endTime = dates[1];
			
			GsonOption pieInOptin = profitChartService.getPieInOption(startTime, endTime);
			GsonOption barCardInOption = profitChartService.getBarCardInOption(startTime, endTime);
			GsonOption lineCardInOption = profitChartService.getLineCardInOption(startTime, endTime);
			GsonOption barCourseInOption = profitChartService.getBarCourseInOption(startTime, endTime);
			GsonOption lineCourseInOptin = profitChartService.getLineCourseInOption(startTime, endTime);
			GsonOption pieOutOptin = profitChartService.getPieOutOption(startTime, endTime);
			GsonOption barMachineOutOption = profitChartService.getBarMachineOutOption(startTime, endTime);
			GsonOption lineMachineOutOption = profitChartService.getLineMachineOutOption(startTime, endTime);
			
			model.addAttribute("pieInOptin", pieInOptin.toString());
			model.addAttribute("barCardInOption", barCardInOption.toString());
			model.addAttribute("lineCardInOption", lineCardInOption.toString());
			model.addAttribute("barCourseInOption", barCourseInOption.toString());
			model.addAttribute("lineCourseInOptin", lineCourseInOptin.toString());
			model.addAttribute("pieOutOptin", pieOutOptin.toString());
			model.addAttribute("barMachineOutOption", barMachineOutOption.toString());
			model.addAttribute("lineMachineOutOption", lineMachineOutOption.toString());
			
			return "testEchart";
		}else {
			GsonOption pieInOptin = profitChartService.getPieInOption(null, null);
			GsonOption barCardInOption = profitChartService.getBarCardInOption(null, null);
			GsonOption lineCardInOption = profitChartService.getLineCardInOption(null, null);
			GsonOption barCourseInOption = profitChartService.getBarCourseInOption(null, null);
			GsonOption lineCourseInOptin = profitChartService.getLineCourseInOption(null, null);
			GsonOption pieOutOptin = profitChartService.getPieOutOption(null, null);
			GsonOption barMachineOutOption = profitChartService.getBarMachineOutOption(null, null);
			GsonOption lineMachineOutOption = profitChartService.getLineMachineOutOption(null, null);
			
			model.addAttribute("pieInOptin", pieInOptin.toString());
			model.addAttribute("barCardInOption", barCardInOption.toString());
			model.addAttribute("lineCardInOption", lineCardInOption.toString());
			model.addAttribute("barCourseInOption", barCourseInOption.toString());
			model.addAttribute("lineCourseInOptin", lineCourseInOptin.toString());
			model.addAttribute("pieOutOptin", pieOutOptin.toString());
			model.addAttribute("barMachineOutOption", barMachineOutOption.toString());
			model.addAttribute("lineMachineOutOption", lineMachineOutOption.toString());
			return "testEchart";
		}
	}

}
