package org.java.Singleton;

public class LazySingleton {
    // 1. Private static instance initially set to null.
    private static LazySingleton instance;

    // 2. Private constructor prevents external instantiation.
    private LazySingleton() {
        // Initialization code, if any.
    }

    // 3. Public method to provide access to the instance.
    public static LazySingleton getInstance() {
        // 4. Check if the instance is null and create it if needed.
        if (instance == null) {
            instance = new LazySingleton();
        }
        System.out.println("Initializing LazySingleton.md Object!!");
        return instance;
    }

}
