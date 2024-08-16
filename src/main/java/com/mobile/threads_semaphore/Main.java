package com.mobile.threads_semaphore;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    static int NO_CARS = 20;
    static Lock lock = new ReentrantLock();
    static int carsPassed = 0;


    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphoreNS = new Semaphore(10);
        Semaphore semaphoreWE = new Semaphore(0);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < NO_CARS; i++) {
            double direction = Math.random();
            System.out.println("Car " + i + ": " + (direction < 0.5));
            Vehicle vehicle = new Vehicle(direction < 0.5, semaphoreNS, semaphoreWE);
            vehicle.start();
            vehicles.add(vehicle);
        }


        for (Vehicle vehicle : vehicles) {
            vehicle.join();
        }

    }
}
