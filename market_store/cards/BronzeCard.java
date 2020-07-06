package market_store.cards;

import market_store.cardholders.Cardholder;

public class BronzeCard extends Card {
    public BronzeCard(Cardholder cardHolder) {
        super(cardHolder, CardType.BRONZE, 0);
    }

    @Override
    public double finalDiscountRate() {
       if(getTurnover() < 100){
           return this.getInitialDiscountRate();
       }
       if(getTurnover() <=300){
           return 1;
       }

       return 2.5;
    }
}
