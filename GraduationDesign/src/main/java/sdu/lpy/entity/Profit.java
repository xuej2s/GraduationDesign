package sdu.lpy.entity;

import java.util.Date;

public class Profit {

	private Date date;
	
	private double courseIn;
	
	private double vipIn;
	
	private double mechineOut;
	
	private double sumIn;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getCourseIn() {
		return courseIn;
	}

	public void setCourseIn(double courseIn) {
		this.courseIn = courseIn;
	}

	public double getVipIn() {
		return vipIn;
	}

	public void setVipIn(double vipIn) {
		this.vipIn = vipIn;
	}

	public double getMechineOut() {
		return mechineOut;
	}

	public void setMechineOut(double mechineOut) {
		this.mechineOut = mechineOut;
	}

	public double getSumIn() {
		return sumIn;
	}

	public void setSumIn(double sumIn) {
		this.sumIn = sumIn;
	}
	
	
}
