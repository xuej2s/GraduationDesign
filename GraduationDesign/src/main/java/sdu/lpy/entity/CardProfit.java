package sdu.lpy.entity;

import java.util.Date;

public class CardProfit {

	private String vipName;
	
	private String cardType;
	
	private double cardFee;
	
	private Date startTime;

	public String getVipName() {
		return vipName;
	}

	public void setVipName(String vipName) {
		this.vipName = vipName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public double getCardFee() {
		return cardFee;
	}

	public void setCardFee(double cardFee) {
		this.cardFee = cardFee;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	
}
