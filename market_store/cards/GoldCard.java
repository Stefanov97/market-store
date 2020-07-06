package market_store.cards;

import market_store.cardholders.Cardholder;

public class GoldCard extends Card {
    public GoldCard(Cardholder cardHolder) {
        super(cardHolder, CardType.GOLD, 2);
    }

    @Override
    public double finalDiscountRate() {
        double maxRate = 10;
        int additionalDiscountRate = (int) this.getTurnover() / 100;
        double finalDiscountRate = this.getInitialDiscountRate() + additionalDiscountRate;
        return Math.min(finalDiscountRate, maxRate);
    }
}
