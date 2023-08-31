package ru.otus.bridge;

@SuppressWarnings("java:S106")
public class CreditCard extends Card {
    public CreditCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    protected void cardType() {
        System.out.println("credit card");
    }
}
