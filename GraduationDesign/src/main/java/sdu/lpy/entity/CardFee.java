package sdu.lpy.entity;

import java.util.Date;

public class CardFee extends CardFeeKey {
    private Double cardFee;

    private Date startTime;

    public Double getCardFee() {
        return cardFee;
    }

    public void setCardFee(Double cardFee) {
        this.cardFee = cardFee;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}