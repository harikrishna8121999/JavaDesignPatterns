package org.java.AbstractFactory;

public class Warrior implements Character{
    public void attack() {
        System.out.println("Warrior attacks with a sword.");
    }
    public void defend() {
        System.out.println("Warrior defends with plate armor.");
    }
}
