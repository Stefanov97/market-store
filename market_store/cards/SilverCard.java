package market_store.cards;

import market_store.cardholders.Cardholder;

public class SilverCard extends Card {

    public SilverCard(Cardholder cardHolder) {
        super(cardHolder, CardType.SILVER, 2);
    }

    @Override
    public double finalDiscountRate() {
        if(this.getTurnover() > 300){
            return 3.5;
        }
        return this.getInitialDiscountRate();
    }
}
