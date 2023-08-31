package ru.outs.state;

@SuppressWarnings("java:S106")
public class OnState implements State {
    @Override
    public State action() {
        System.out.println("лампа светит");
        return StateProvider.getOffState();
    }
}
