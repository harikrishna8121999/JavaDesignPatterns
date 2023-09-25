package org.java.FactoryMethod;

public class App {
    public static void main(String[] args) {
        PizzaFactory factory = new SimplePizzaFactory();

        Pizza cheesePizza = factory.createPizza("cheese");
        cheesePizza.prepare();

        Pizza pepperoniPizza = factory.createPizza("pepperoni");
        pepperoniPizza.prepare();
    }
}