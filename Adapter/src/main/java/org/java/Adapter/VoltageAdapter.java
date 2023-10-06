package org.java.Adapter;

// VoltageAdapter adapts Voltage220V interface to Voltage110V interface
public class VoltageAdapter implements Voltage110V {
    private Voltage220V socket;

    public VoltageAdapter(Voltage220V socket) {
        this.socket = socket;
    }

    @Override
    public int provide110V() {
        int inputVoltage = socket.provide220V();
        // Perform necessary calculations and conversions
        int outputVoltage = inputVoltage / 2;
        return outputVoltage;
    }
}
