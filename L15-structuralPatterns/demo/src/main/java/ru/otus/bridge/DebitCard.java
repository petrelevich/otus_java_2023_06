package ru.otus.bridge;

@SuppressWarnings("java:S106")
public class DebitCard extends Card {
    public DebitCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    protected void cardType() {
        System.out.println("debit card");
    }
}
