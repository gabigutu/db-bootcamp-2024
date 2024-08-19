package com.mobile.design_patterns.command;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("Rex");

        Dog rova = new Dog("Rova");

        ICommandDog commandBring = new CommandBring();
        ICommandDog commandStand = new CommandStand();
        ICommandDog commandStay = new CommandStay();

        commandStand.execute(rex);
        commandBring.execute(rex);
        commandStay.execute(rex);

        commandStand.execute(rova);
        commandBring.execute(rova);
        commandStay.execute(rova);



    }
}
