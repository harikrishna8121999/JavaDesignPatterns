package org.java;

// CheesePizza.java inherits Parent class Pizza
public class CheesePizza implements Pizza{
    // Implementation of methods for creating a cheese pizza
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza!!");
    }
}
