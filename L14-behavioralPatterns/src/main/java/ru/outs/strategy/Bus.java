package ru.outs.strategy;

@SuppressWarnings("java:S106")
public class Bus implements Strategy {
    @Override
    public void transportation() {
        System.out.println("доехать на автобусе");
    }
}
