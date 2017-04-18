package sdu.lpy.entity;

import java.util.Date;

public class ActivityManage {
    private String activityName;

    private String cardType;

    private String activityObj;

    private Date startTime;

    private Date endTime;

    private Double discount;

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getActivityObj() {
        return activityObj;
    }

    public void setActivityObj(String activityObj) {
        this.activityObj = activityObj == null ? null : activityObj.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}