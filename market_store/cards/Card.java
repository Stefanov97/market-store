package market_store.cards;

import market_store.cardholders.Cardholder;

public abstract class Card {
    private Cardholder cardHolder;
    private CardType cardType;
    private double turnover;
    private double initialDiscountRate;

    public Card(Cardholder cardHolder, CardType cardType, double initialDiscountRate) {
        this.cardHolder = cardHolder;
        this.cardType = cardType;
        this.initialDiscountRate = initialDiscountRate;
    }


    protected Cardholder getCardHolder() {
        return this.cardHolder;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    protected double getTurnover() {
        return this.turnover;
    }

    public void setTurnover(double turnover) {
        if (turnover < 0) {
            throw new IllegalArgumentException("Turnover cannot be negative");
        }
        this.turnover = turnover;
    }

    protected double getInitialDiscountRate() {
        return this.initialDiscountRate;
    }

    public abstract double finalDiscountRate();
}
