package sdu.lpy.entity;

public class Card {
    private String cardType;

    private String cardName;

    private double cardCost;

    private Integer cardTime;

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public double getCardCost() {
        return cardCost;
    }

    public void setCardCost(Double cardCost) {
        this.cardCost = cardCost == null ? null : cardCost;
    }

    public Integer getCardTime() {
        return cardTime;
    }

    public void setCardTime(Integer cardTime) {
        this.cardTime = cardTime;
    }
}