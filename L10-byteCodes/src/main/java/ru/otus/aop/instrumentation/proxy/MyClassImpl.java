package ru.otus.aop.instrumentation.proxy;

@SuppressWarnings("java:S106")
public class MyClassImpl {

    public void secureAccess(String param) {
        System.out.println("secureAccess, param:" + param);
    }

    @Override
    public String toString() {
        return "MyClassImpl{}";
    }
}
