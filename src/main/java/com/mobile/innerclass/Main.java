package com.mobile.innerclass;

public class Main {
    public static void main(String[] args) {
        Car dacia = new Car("Dacia", "Duster");
        dacia.enterCar();

        Car.Engine engine = dacia.new Engine(1);
        engine.startEngine();

        Car.Engine engine2 = dacia.new Engine(2, "4 cilindrii");
        engine2.startEngine();

        System.out.println("Number of engines: " + engine2.getNumberOfEngines());
        System.out.println("Number of engines: " + Car.Engine.getNumberOfEngines());

        Car.SteeringWheel steeringWheel = new Car.SteeringWheel("steeringWheel");
        steeringWheel.turnLeft();
        steeringWheel.turnRight();
        steeringWheel.block();
        Car.SteeringWheel.block();

        // KEY
        Car.Engine engineOfUnknownCar = new Car().new Engine(1);
        Car.SteeringWheel steeringWheel2 = new Car.SteeringWheel("steeringWheel2");
        // KEY
        int test                             = Car.ceva;




    }
}
