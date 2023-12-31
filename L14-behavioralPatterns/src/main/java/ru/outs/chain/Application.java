package ru.outs.chain;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S106")
class Application {
    private final List<String> history = new ArrayList<>();

    void addHistoryRecord(String historyRecord) {
        history.add(historyRecord);
    }

    void printHistory() {
        System.out.println(history);
    }
}
