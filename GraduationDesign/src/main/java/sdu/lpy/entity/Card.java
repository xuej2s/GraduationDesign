package sdu.lpy.entity;

public class Card {
    private String cardType;

    private String cardName;

    private String cardCost;

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

    public String getCardCost() {
        return cardCost;
    }

    public void setCardCost(String cardCost) {
        this.cardCost = cardCost == null ? null : cardCost.trim();
    }

    public Integer getCardTime() {
        return cardTime;
    }

    public void setCardTime(Integer cardTime) {
        this.cardTime = cardTime;
    }
}