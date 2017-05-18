package sdu.lpy.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import sdu.lpy.entity.CardProfit;
import sdu.lpy.entity.CourseProfit;
import sdu.lpy.entity.MachineBuyConfig;
import sdu.lpy.entity.Profit;

public interface ProfitService {
	
	
	void outputToExcel(String startTime,String endTime) throws ParseException;
	
	List<Profit> getProfit(Date startTime,Date endTime);
	
	List<CourseProfit> getCourseProfit(Date startTime,Date endTime);
	
	List<CardProfit> getCardProfit(Date startTime,Date endTime);
	
	List<MachineBuyConfig> getMachineProfit(Date startTime,Date endTime);
}
