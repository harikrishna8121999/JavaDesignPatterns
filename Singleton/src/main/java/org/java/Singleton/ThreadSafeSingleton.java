package org.java.Singleton;

public class ThreadSafeSingleton {
    // 1. Private static instance initially set to null.
    private static ThreadSafeSingleton instance;

    // 2. Private constructor prevents external instantiation.
    private ThreadSafeSingleton() {
        // Initialization code, if any.
    }

    // 3. Public synchronized method to provide access to the instance.
    public static synchronized ThreadSafeSingleton getInstance() {
        // 4. Check if the instance is null and create it if needed.
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        System.out.println("Initializing ThreadSafeSingleton object!!");
        return instance;
    }
}
