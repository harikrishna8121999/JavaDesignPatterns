package org.java.FactoryMethod;

public class SimplePizzaFactory implements PizzaFactory{
    public Pizza createPizza(String pizzaName) {
        Pizza pizza = null;

        // Create the respective pizza based on the pizzaName
        if (pizzaName.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (pizzaName.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
