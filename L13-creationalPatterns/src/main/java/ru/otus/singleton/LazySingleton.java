package ru.otus.singleton;

public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton() {
        System.out.println("run constructor");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            // плохо, может быть гонка и мы можем получить два синглтона
            System.out.println("lazy init");
            instance = new LazySingleton();
        }

        return instance;
    }

    public synchronized static LazySingleton getInstance2() {
        // ок, но медленно
        if (instance == null) {
            System.out.println("lazy init");
            instance = new LazySingleton();
        }

        return instance;
    }

    public static LazySingleton getInstance3() {
        // сложно и не работает - см https://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    System.out.println("lazy init");
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }
}

class LazySingletonDemo {
    public static void main(String[] args) {
        System.out.println("--- begin ---");

        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.printf("singleton1 == singleton2 => %b\n", singleton1 == singleton2);
        System.out.println("---end ---");
    }
}