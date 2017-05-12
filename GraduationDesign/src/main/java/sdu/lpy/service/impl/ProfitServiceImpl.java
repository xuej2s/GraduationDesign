package sdu.lpy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdu.lpy.dao.CardFeeMapper;
import sdu.lpy.dao.CourseSelectMapper;
import sdu.lpy.dao.MachineFeeMapper;
import sdu.lpy.service.ProfitService;

@Service("profitService")
public class ProfitServiceImpl implements ProfitService {
	
	@Autowired
	private CourseSelectMapper courseSelectMapper;
	
	@Autowired
	private CardFeeMapper cardFeeMapper;
	
	@Autowired
	private MachineFeeMapper machineFeeMapper;

	public int getMechineOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getCourseProfit() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getVipProfit() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void outputToExcel() {
		// TODO Auto-generated method stub

	}

}
