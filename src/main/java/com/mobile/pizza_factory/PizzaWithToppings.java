package com.mobile.pizza_factory;

import java.util.ArrayList;
import java.util.List;

public class PizzaWithToppings {

    private List<Topping> toppings;
    private Pizza pizza;

    public PizzaWithToppings(Pizza pizza) {
        toppings = new ArrayList<Topping>();
        this.pizza = pizza;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        return "PizzaWithToppings{" +
                "pizza=" + pizza +
                ", additional=" + toppings +
                '}';
    }
}
