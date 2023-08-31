package ru.otus.bridge;

@SuppressWarnings("java:S106")
public class MirPS implements PaymentSystem {
    @Override
    public void printName() {
        System.out.println("Mir");
    }
}
