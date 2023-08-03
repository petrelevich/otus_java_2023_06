package ru.otus.aop.instrumentation.changer;

/*
java -javaagent:summatorDemo.jar -jar summatorDemo.jar
*/
@SuppressWarnings("java:S106")
public class SummatorDemo {
    public static void main(String[] args) {
        var anyClass = new AnyClass();
        System.out.println(anyClass.summator(30, 20));
    }
}
