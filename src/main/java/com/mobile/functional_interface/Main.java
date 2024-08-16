package com.mobile.functional_interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Function<Animal, Om> myFunction = (animal) -> {
            String tipAnimal = animal.getTip();
            tipAnimal = tipAnimal.toUpperCase();
            return new Om(tipAnimal);
        };
        Animal maimuta = new Animal("maimuta");
        Om om = myFunction.apply(maimuta);
        System.out.println(om.getDerivat());

        Animal delfin = new Animal("delfin");
        Om omDelfin = myFunction.apply(delfin);
        System.out.println(omDelfin.getDerivat());


        Consumer<FastFood> consumatorFastFood = (fastFood) -> {
            System.out.println("Mananca " + fastFood.getName());
        };

        Hamburger hamburgerCheese = new Hamburger("cheese hbg");
        Pizza prosciutoEtFunghi = new Pizza("prosciuto et funghi");
        consumatorFastFood.accept(hamburgerCheese);
        consumatorFastFood.accept(prosciutoEtFunghi);


        System.out.println("-------------------");
        BiConsumer<FastFood, FastFood> consumatorHardcoreFastFood =
                (fastFood, fastFood2) -> {
                    System.out.println("Mananca prima mancare " + fastFood.getName());
                    System.out.println("Mananca a doua mancare " + fastFood2.getName());
                };
        consumatorHardcoreFastFood.accept(hamburgerCheese, prosciutoEtFunghi);

        System.out.println("====================");

        Predicate<Food> predicateIsFastFood = (food) -> food.isFastFood();
        System.out.println(prosciutoEtFunghi.getName() + " e fast food? " + predicateIsFastFood.test(prosciutoEtFunghi));
        System.out.println(hamburgerCheese.getName() + " e fast food? " + predicateIsFastFood.test(hamburgerCheese));

        Paella shrimpsPaella = new Paella("shrimps");
        System.out.println(shrimpsPaella.getName() + " e fast food? " + predicateIsFastFood.test(shrimpsPaella));

    }
}

class Animal {

    private String tip;

    public Animal(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }
}

class Om {

    private String derivat;

    public Om(String derivat) {
        this.derivat = "Om care se trage din " + derivat;
    }

    public String getDerivat() {
        return derivat;
    }
}

class Food {
    protected String name;
    protected boolean fastFood;

    public boolean isFastFood() {
        return fastFood;
    }

    public String getName() {
        return name;
    }
}

class NonFastFood extends Food {
    public NonFastFood() {
        this.fastFood = false;
    }
}
class Paella extends NonFastFood {
    public Paella(String name) {
        this.name = "(Paella) " + name;
    }
}

class FastFood extends Food {

    public FastFood() {
        this.fastFood = true;
    }
}

class Hamburger extends FastFood {
    public Hamburger(String name) {
        this.name = "(Hamburger) " + name;
    }
}

class Pizza extends FastFood {
    public Pizza(String name) {
        this.name = "(Pizza) " + name;
    }
}