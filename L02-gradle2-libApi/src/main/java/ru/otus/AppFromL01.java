package ru.otus;

import com.google.common.collect.Lists;
import java.util.ArrayList;

@SuppressWarnings("java:S106")
public class AppFromL01 {
    private AppFromL01() {}

    public static void say() {
        System.out.println(Lists.reverse(new ArrayList<>()));
        System.out.println("I am from L01");
    }
}
