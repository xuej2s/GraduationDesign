package sdu.lpy.entity;

import java.util.Date;

public class Vip {
    private String vipId;

    private String vipName;

    private String vipSex;

    private String vipCard;

    private String vipTel;

    private String cardType;

    private Date endTime;

    private String vipPassword;

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId == null ? null : vipId.trim();
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName == null ? null : vipName.trim();
    }

    public String getVipSex() {
        return vipSex;
    }

    public void setVipSex(String vipSex) {
        this.vipSex = vipSex == null ? null : vipSex.trim();
    }

    public String getVipCard() {
        return vipCard;
    }

    public void setVipCard(String vipCard) {
        this.vipCard = vipCard == null ? null : vipCard.trim();
    }

    public String getVipTel() {
        return vipTel;
    }

    public void setVipTel(String vipTel) {
        this.vipTel = vipTel == null ? null : vipTel.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getVipPassword() {
        return vipPassword;
    }

    public void setVipPassword(String vipPassword) {
        this.vipPassword = vipPassword == null ? null : vipPassword.trim();
    }
}