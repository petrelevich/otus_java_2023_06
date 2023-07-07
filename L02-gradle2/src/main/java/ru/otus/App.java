package ru.otus;

import com.zaxxer.hikari.HikariConfig;

@SuppressWarnings("java:S106")
public class App {
    public static void main(String... args) {
        HikariConfig config = new HikariConfig();
        System.out.println(config);
    }
}
