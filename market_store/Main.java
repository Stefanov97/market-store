package market_store;

import market_store.cardholders.Cardholder;
import market_store.cards.BronzeCard;
import market_store.cards.Card;
import market_store.cards.GoldCard;
import market_store.cards.SilverCard;
import market_store.pay_office.PayOffice;

public class Main {
    public static void main(String[] args) {
        Cardholder cardholder = new Cardholder("Pavel", "Stefanov");
        Card bronzeCard = new BronzeCard(cardholder);
        try {
            printInvoice(150, bronzeCard);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Card silverCard = new SilverCard(cardholder);
        try {
            silverCard.setTurnover(600);
            printInvoice(850, silverCard);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Card goldCard = new GoldCard(cardholder);
        try {
            goldCard.setTurnover(1500);
            printInvoice(1300, goldCard);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printInvoice(double purchaseValue, Card card) {
        if (card == null) {
            throw new IllegalArgumentException("Card cannot be null");
        }
        System.out.println(String.format("%s:%nPurchase value: $%.2f%nDiscount rate: %.1f%%%nDiscount: %.2f%nTotal: $%.2f",
                card.getCardType().name().charAt(0) + card.getCardType().name().substring(1).toLowerCase(),
                purchaseValue,
                PayOffice.getDiscountRate(card),
                PayOffice.calculateDiscount(purchaseValue, card),
                PayOffice.calculateTotalPrice(purchaseValue, card)));

    }
}
