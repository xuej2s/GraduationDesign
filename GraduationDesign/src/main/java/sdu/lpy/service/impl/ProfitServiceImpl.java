package sdu.lpy.service.impl;

import java.util.Date;
import java.util.List;

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


	public void outputToExcel() {
		// TODO Auto-generated method stub

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
