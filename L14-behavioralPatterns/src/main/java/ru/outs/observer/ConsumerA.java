package ru.outs.observer;

@SuppressWarnings("java:S106")
public class ConsumerA implements Listener {

    @Override
    public void onUpdate(String data) {
        System.out.println("ConsumerA data:" + data);
    }
}
