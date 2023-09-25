package org.java.Singleton;

public class BasicSingleton {
    private static BasicSingleton instance;

    private BasicSingleton() {
        // Private constructor prevents instantiation from other classes.
    }

    public static BasicSingleton getInstance() {
        if (instance == null) {
            instance = new BasicSingleton();
        }
        System.out.println("Initializing BasicSingleton object!!");
        return instance;
    }
}
