package sdu.lpy.service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdu.lpy.dao.CardFeeMapper;
import sdu.lpy.dao.CourseSelectMapper;
import sdu.lpy.dao.MachineConfigMapper;
import sdu.lpy.dao.MachineFeeMapper;
import sdu.lpy.dao.ProfitMapper;
import sdu.lpy.entity.CardProfit;
import sdu.lpy.entity.CourseProfit;
import sdu.lpy.entity.MachineBuyConfig;
import sdu.lpy.entity.Profit;
import sdu.lpy.service.ProfitService;
import sdu.lpy.util.ExportExcel;
import sdu.lpy.util.WebUtil;

@Service("profitService")
public class ProfitServiceImpl implements ProfitService {
	
	@Autowired
	private CourseSelectMapper courseSelectMapper;
	
	@Autowired
	private CardFeeMapper cardFeeMapper;
	
	@Autowired
	private MachineConfigMapper machineConfigMapper;
	
	@Autowired
	private ProfitMapper profitMapper;


	public void outputToExcel(String startTime,String endTime) throws ParseException {
		// TODO Auto-generated method stub
		Date[] dates = new Date[2];
		if (startTime != null && endTime != null) {
			
			String dateRange = startTime +" - "+endTime;
			dates = WebUtil.changeDateRangeToDate(dateRange);
		}else {
			dates[0] = null;
			dates[1] = null;
		}
		
		List<Profit> profits = profitMapper.getProfit(dates[0], dates[1]);
		List<CourseProfit> courseProfits = courseSelectMapper.getCourseProfit(dates[0],WebUtil.getEndTime(dates[1], 1));
		List<CardProfit> cardProfits = cardFeeMapper.getCardProfit(dates[0], WebUtil.getEndTime(dates[1], 1));
		List<MachineBuyConfig> machineBuyConfigs = machineConfigMapper.getMachineProfit(dates[0], WebUtil.getEndTime(dates[1], 1));
		
		Map<String, String> profitMap = new LinkedHashMap<String, String>();
		profitMap.put("date", "时间");
		profitMap.put("vip", "会员收益");
		profitMap.put("course", "课程收益");
		profitMap.put("mechine", "器械支出");
		profitMap.put("sum", "总计");
		String sheetName = "财务总表";
		
		Map<String, String> courseProfitMap = new LinkedHashMap<String, String>();
		courseProfitMap.put("selectTime", "时间");
		courseProfitMap.put("courseName", "课程名称");
		courseProfitMap.put("vipName", "会员姓名");
		courseProfitMap.put("courseCost", "课程收益");
		String courseSheet = "课程收益";
		
		Map<String, String> cardProfitMap = new LinkedHashMap<String, String>();
		cardProfitMap.put("startTime", "时间");
		cardProfitMap.put("vipName", "会员姓名");
		cardProfitMap.put("cardType", "办卡类型");
		cardProfitMap.put("cardFee", "办卡收益");
		String cardSheet = "办卡收益（1、年卡会员 2、季卡会员 3、月卡会员）";
		
		Map<String, String> machineOutMap = new LinkedHashMap<String, String>();
		machineOutMap.put("time", "时间");
		machineOutMap.put("machineName", "器械名称");
		machineOutMap.put("machineBrand", "器械品牌");
		machineOutMap.put("machineCost", "单价");
		machineOutMap.put("machineCount", "购买数量");
		machineOutMap.put("sumCost", "支出");
		String machineSheet = "器械支出";
		
		ExportExcel.excelExport(profits, profitMap, sheetName);
		ExportExcel.excelExport(courseProfits, courseProfitMap, courseSheet);
		ExportExcel.excelExport(cardProfits, cardProfitMap, cardSheet);
		ExportExcel.excelExport(machineBuyConfigs, machineOutMap, machineSheet);
	}

	public List<Profit> getProfit(Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return profitMapper.getProfit(startTime, endTime);
	}

	public List<CourseProfit> getCourseProfit(Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return courseSelectMapper.getCourseProfit(startTime, endTime);
	}

	public List<CardProfit> getCardProfit(Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return cardFeeMapper.getCardProfit(startTime, endTime);
	}

	public List<MachineBuyConfig> getMachineProfit(Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return machineConfigMapper.getMachineProfit(startTime, endTime);
	}

}
