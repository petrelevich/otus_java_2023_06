package ru.otus.aop.instrumentation.setter;

import java.lang.reflect.InvocationTargetException;

/*
    java -javaagent:setterDemo.jar -jar setterDemo.jar
*/
@SuppressWarnings("java:S106")
public class SetterDemo {

    public static void main(String[] args) throws Exception {
        System.out.println("main");
        var demo = new MyClass();
        System.out.println(demo.getValue());
        modifyPrivateValue(demo);
        System.out.println(demo.getValue());
    }

    private static void modifyPrivateValue(MyClass demo)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        demo.getClass().getMethod("setValue", int.class).invoke(demo, -4);
    }
}
