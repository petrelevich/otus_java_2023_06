package ru.otus.listener;

import ru.otus.model.Message;

@SuppressWarnings("java:S106")
public class ListenerPrinterConsole implements Listener {

    @Override
    public void onUpdated(Message msg) {
        var logString = String.format("oldMsg:%s", msg);
        System.out.println(logString);
    }
}
