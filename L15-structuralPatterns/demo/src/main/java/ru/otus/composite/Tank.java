package ru.otus.composite;

/** Танк. */
@SuppressWarnings("java:S106")
public class Tank implements Unit {
    @Override
    public void move() {
        System.out.println("Tank is moving");
    }
}
