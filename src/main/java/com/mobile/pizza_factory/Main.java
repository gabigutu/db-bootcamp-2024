package com.mobile.pizza_factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int NO_CLIENTS = 7;
        int NO_PIZZA = 20;
        int NO_TOPPINGS = 20;

        PizzaFactory fabio = new PizzaFactory();
        PizzaFactory.PizzaType[] types = PizzaFactory.PizzaType.values();
        int k = 0;
        for (PizzaFactory.PizzaType type : types) {
            types[k++] = type;
        }

        Topping[] toppings = new Topping[NO_TOPPINGS];
        for (int i = 0; i < NO_TOPPINGS; i++) {
            int toppingType = (int) Math.floor(Math.random() * 3);
            switch (toppingType) {
                case 0:
                    toppings[i] = new Tomato();
                    break;
                case 1:
                    toppings[i] = new Pepper();
                    break;
                case 2:
                    toppings[i] = new Cheese();
                    break;
            }

        }

        List<Client> clients = new ArrayList<>();
        for (int i = 0; i < NO_CLIENTS; i++) {
            Client client = new Client("Client " + i);
            clients.add(client);
            // ii abonam
            if (Math.random() < 0.5) {
                fabio.anuntama(client);
            }
        }

        for (int i = 0; i < NO_PIZZA; i++) {
            int type = (int) Math.floor(Math.random() * types.length);
            Pizza pizza = fabio.createPizza(types[type], Arrays.asList(toppings));
            PizzaWithToppings pizzaWithToppings = new PizzaWithToppings(pizza);
        }


    }
}
