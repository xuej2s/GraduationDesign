package sdu.lpy.controller;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.lpy.entity.CardProfit;
import sdu.lpy.entity.CourseProfit;
import sdu.lpy.entity.MachineBuyConfig;
import sdu.lpy.entity.Profit;
import sdu.lpy.service.ProfitService;
import sdu.lpy.util.WebUtil;

@Controller
@RequestMapping("/admin/")
public class ProfitController {

	@Autowired
	private ProfitService profitService;

	@RequestMapping("profit.do")
	public String profit(String dateRange, Model model) throws ParseException {
		if (dateRange != null) {
			Date[] dates = WebUtil.changeDateRangeToDate(dateRange);
			Date startTime = dates[0];
			Date endTime = dates[1];
			
			String startTimeString = WebUtil.changeDateToString(startTime);
			String endTimeString =  WebUtil.changeDateToString(endTime);

			List<Profit> profits = profitService.getProfit(startTime, endTime);
			List<CourseProfit> courseProfits = profitService.getCourseProfit(startTime, WebUtil.getEndTime(endTime, 1));
			List<CardProfit> cardProfits = profitService.getCardProfit(startTime, WebUtil.getEndTime(endTime, 1));
			List<MachineBuyConfig> machineBuyConfigs = profitService.getMachineProfit(startTime, WebUtil.getEndTime(endTime, 1));

			model.addAttribute("profitList", profits);
			model.addAttribute("courseProfits", courseProfits);
			model.addAttribute("cardProfits", cardProfits);
			model.addAttribute("machineBuyConfigs", machineBuyConfigs);
			model.addAttribute("startTime", startTimeString);
			model.addAttribute("endTime", endTimeString);

			return "profitPage";
		} else {

			List<Profit> profits = profitService.getProfit(null, null);
			List<CourseProfit> courseProfits = profitService.getCourseProfit(null, null);
			List<CardProfit> cardProfits = profitService.getCardProfit(null, null);
			List<MachineBuyConfig> machineBuyConfigs = profitService.getMachineProfit(null, null);

			model.addAttribute("profitList", profits);
			model.addAttribute("courseProfits", courseProfits);
			model.addAttribute("cardProfits", cardProfits);
			model.addAttribute("machineBuyConfigs", machineBuyConfigs);
			model.addAttribute("profitList", profits);
			model.addAttribute("startTime", null);
			model.addAttribute("endTime", null);

			return "profitPage";
		}
	}
	
	@RequestMapping("excelout.do")
	public String excelOut(String startTime,String endTime) throws UnsupportedEncodingException, ParseException{
		if (startTime != null && endTime != null && startTime != "" && endTime != "") {
			
			profitService.outputToExcel(startTime, endTime);
			return "redirect:profit.do";
		}else {
			profitService.outputToExcel(null, null);
			return "redirect:profit.do";
		}
	}
}

/* // 设置response参数，可以打开下载页面
        res.reset();
        res.setContentType("application/vnd.ms-excel;charset=utf-8");
        res.setHeader("Content-Disposition", "attachment;filename="
                + new String(("test" + ".xls").getBytes(), "iso-8859-1"));*/