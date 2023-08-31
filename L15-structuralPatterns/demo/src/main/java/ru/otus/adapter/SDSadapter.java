package ru.otus.adapter;

/** SDS-адаптер. */
@SuppressWarnings("java:S106")
public class SDSadapter implements SDSdril {
    private final Drill drill;

    public SDSadapter(Drill drill) {
        this.drill = drill;
    }

    @Override
    public void action() {
        // Адаптер не содержит логики
        // Он делегирует работу адаптируемым классам
        System.out.println(this.drill);
    }
}
