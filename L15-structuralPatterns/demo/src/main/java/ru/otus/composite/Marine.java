package ru.otus.composite;

/** Морской пехотинец. */
@SuppressWarnings("java:S106")
public class Marine implements Unit {
    @Override
    public void move() {
        System.out.println("Marine is moving");
    }
}
