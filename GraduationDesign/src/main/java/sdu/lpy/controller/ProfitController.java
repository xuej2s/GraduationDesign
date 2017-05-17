package sdu.lpy.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
			
			List<Profit> profits = profitService.getProfit(startTime, endTime);
			model.addAttribute("profitList", profits);
			
			
			return "profitPage";
		} else {
			
			List<Profit> profits = profitService.getProfit(null, null);

			model.addAttribute("profitList", profits);
			return "profitPage";
		}
	}
}
