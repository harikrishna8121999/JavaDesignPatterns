package org.java.Adapter;

// Socket220V implements Voltage220V interface
public class Socket220V implements Voltage220V {
    @Override
    public int provide220V() {
        return 220;
    }
}
