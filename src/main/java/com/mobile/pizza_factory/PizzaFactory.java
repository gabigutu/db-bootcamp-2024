package com.mobile.pizza_factory;

import java.util.ArrayList;
import java.util.List;

class Pizza {}

class Margherita extends Pizza {}

class Capriciosa extends Pizza {}

class Quatro_Formaggi extends Pizza {}

class Pollo extends Pizza {}

public class PizzaFactory {

    enum PizzaType {
        MARGHERITA, CAPRICIOSA, QUATRO_FORMAGGI, POLLO;
    }

    List<Client> subscribers = new ArrayList();

    void anuntama(Client client) {
        System.out.println("Client " + client + " se aboneaza");
        subscribers.add(client);
    }

    private void notifica(PizzaWithToppings pizzaWithToppings) {
        for(Client subscriber : subscribers) {
            subscriber.afla("S-a facut o pizza: " + pizzaWithToppings); // TODO: de care?
        }
    }

    Pizza createPizza(PizzaType pizzaType, List<Topping> toppings) {
        Pizza pizza = null;
        switch (pizzaType) {
            case MARGHERITA:
                pizza = new Margherita();
                break;
            case CAPRICIOSA:
                pizza = new Capriciosa();
                break;
            case QUATRO_FORMAGGI:
                pizza = new Quatro_Formaggi();
                break;
            case POLLO:
                pizza = new Pollo();
                break;
        }
        PizzaWithToppings pizzaWithToppings = addToppings(pizza, toppings);
        System.out.println("Baking pizza with toppings: " + pizzaWithToppings);
        notifica(pizzaWithToppings);
        return pizza;
    }

    private  PizzaWithToppings addToppings(Pizza pizza, List<Topping> toppings) {
        PizzaWithToppings pizzaWithToppings = new PizzaWithToppings(pizza);
        for (Topping topping : toppings) {
            pizzaWithToppings.addTopping(topping);
        }
        return pizzaWithToppings;
    }

}
