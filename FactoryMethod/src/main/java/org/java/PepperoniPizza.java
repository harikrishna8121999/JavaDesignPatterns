package org.java;

// PepperoniPizza.java inherits Parent class Pizza
public class PepperoniPizza implements Pizza{
    // Implementation of methods for creating a pepperoni pizza
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza!!");
    }
}
