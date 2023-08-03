package ru.otus.aop.proxy;

@SuppressWarnings("java:S106")
public class MyClassImpl implements MyClassInterface {

    @Override
    public void secureAccess(String param) {
        System.out.println("secureAccess, param:" + param);
    }

    @Override
    public String toString() {
        return "MyClassImpl{}";
    }
}
