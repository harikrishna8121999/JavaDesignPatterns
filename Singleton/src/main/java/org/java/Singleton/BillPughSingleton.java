package org.java.Singleton;

public class BillPughSingleton {
    // Private constructor prevents external instantiation.
    private BillPughSingleton() {
        // Initialization code, if any.
    }

    // Inner static class responsible for lazy initialization.
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Public method to provide access to the instance.
    public static BillPughSingleton getInstance() {
        System.out.println("Initializing BillPughSingleton object!!");
        return SingletonHelper.INSTANCE;
    }
}
