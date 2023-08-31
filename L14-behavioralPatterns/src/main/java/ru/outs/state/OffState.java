package ru.outs.state;

@SuppressWarnings("java:S106")
public class OffState implements State {
    @Override
    public State action() {
        System.out.println("не светит");
        return StateProvider.getOnState();
    }
}
