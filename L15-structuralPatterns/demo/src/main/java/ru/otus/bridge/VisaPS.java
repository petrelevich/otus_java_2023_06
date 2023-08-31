package ru.otus.bridge;

@SuppressWarnings("java:S106")
public class VisaPS implements PaymentSystem {
    @Override
    public void printName() {
        System.out.println("VisaPS");
    }
}
