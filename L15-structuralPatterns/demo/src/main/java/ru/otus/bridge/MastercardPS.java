package ru.otus.bridge;

@SuppressWarnings("java:S106")
public class MastercardPS implements PaymentSystem {
    @Override
    public void printName() {
        System.out.println("MastercardPS");
    }
}
