package sdu.lpy.entity;

import java.util.Date;

public class CourseProfit {

	private String courseName;
	
	private String vipName;
	
	private Date selectTime;
	
	private double courseCost;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getVipName() {
		return vipName;
	}

	public void setVipName(String vipName) {
		this.vipName = vipName;
	}

	public Date getSelectTime() {
		return selectTime;
	}

	public void setSelectTime(Date selectTime) {
		this.selectTime = selectTime;
	}

	public double getCourseCost() {
		return courseCost;
	}

	public void setCourseCost(double courseCost) {
		this.courseCost = courseCost;
	}
	
	
}
