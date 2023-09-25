package org.java.Singleton;

public class EagerSingleton {
    // 1. Private static instance created during class loading.
    private static final EagerSingleton instance = new EagerSingleton();

    // 2. Private constructor prevents external instantiation.
    private EagerSingleton() {
        // Initialization code, if any.
    }

    // 3. Public method to provide access to the instance.
    public static EagerSingleton getInstance() {
        System.out.println("Initializing EagerSingleton Object!!");
        return instance;
    }

}
