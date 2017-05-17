package sdu.lpy.service;

import java.util.Date;
import java.util.List;

import sdu.lpy.entity.Profit;

public interface ProfitService {
	
	int getMechineOut();
	
	int getCourseProfit();
	
	int getVipProfit();
	
	void outputToExcel();
	
	List<Profit> getProfit(Date startTime,Date endTime);
}
