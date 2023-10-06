package org.java.Adapter;

public class App {
    public static void main(String[] args) {

        Voltage220V socket220V = new Socket220V();
        VoltageAdapter voltageAdapter = new VoltageAdapter(socket220V);

        System.out.println("Socket 220V output: " + socket220V.provide220V() + "V");
        System.out.println("Adapter output: " + voltageAdapter.provide110V() + "V");
    }
}