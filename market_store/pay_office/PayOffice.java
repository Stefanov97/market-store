package market_store.pay_office;

import market_store.cards.Card;

public class PayOffice {
    public static double getDiscountRate(Card card) {
        return card.finalDiscountRate();
    }

    public static double calculateDiscount(double purchaseValue, Card card) {
        if (purchaseValue < 0.01) {
            throw new IllegalArgumentException("Purchase value cannot be zero or negative");
        }
        return card.finalDiscountRate() / 100 * purchaseValue;
    }

    public static double calculateTotalPrice(double purchaseValue, Card card) {
        if (purchaseValue < 0.01) {
            throw new IllegalArgumentException("Purchase value cannot be zero or negative");
        }
        return purchaseValue - calculateDiscount(purchaseValue, card);
    }
}
