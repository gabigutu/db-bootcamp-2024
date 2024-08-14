package com.mobile.threadsempahore;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Main {

    static int NO_CARS = 1000;


    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphoreNS = new Semaphore(10);
        Semaphore semaphoreWE = new Semaphore(0);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < NO_CARS; i++) {
            Vehicle vehicle = new Vehicle(Math.random() < 0.5, semaphoreNS, semaphoreWE);
            vehicle.start();
            vehicles.add(vehicle);
        }

        for (Vehicle vehicle : vehicles) {
            vehicle.join();
        }

    }
}
