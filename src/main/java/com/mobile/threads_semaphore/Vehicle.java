package com.mobile.threads_semaphore;

import java.util.concurrent.Semaphore;

public class Vehicle extends Thread {

    private boolean direction;
    private Semaphore semaphoreNS;
    private Semaphore semaphoreWE;

    public Vehicle (boolean direction, Semaphore semaphoreNS, Semaphore semaphoreWE) {
        this.direction = direction;
        this.semaphoreNS = semaphoreNS;
        this.semaphoreWE = semaphoreWE;
    }

    @Override
    public void run() {

        try {
            // 9812, 31, 35, 77, 65
            if (direction) { // vertical (31, 35, 90, ...)
                semaphoreNS.acquire(); // 3 permits
                    // 9812, 543, 888
                    System.out.println("|||||NS||||| Vehicle " + getName() + " is passing intersection from North to South (no Permits = " + semaphoreNS.availablePermits() + ") ");
                    // au intrat max 10
                    Main.lock.lock();
                    // garantat unul singur
                        Main.carsPassed++;
                        if (Main.carsPassed == 10) {
                            // 615, 222, 90, 11, 34, 52, 10
                            System.out.println("=======================================");
                            Main.carsPassed = 0;
                            semaphoreWE.release(10);

                        }
                    Main.lock.unlock();
            } else { // orizontala (77, 65, ...)
                    semaphoreWE.acquire(); // 0 permit-uri
                    System.out.println("===WE=== Vehicle " + getName() + " is passing intersection from West to East (no Permits = " + semaphoreWE.availablePermits() + ") ");
                    Main.lock.lock();
                        Main.carsPassed++;
                        if (Main.carsPassed == 10) {
                            System.out.println("||||||||||||||||||||||||||||||||||||||");
                            Main.carsPassed = 0;
                            semaphoreNS.release(10);
                        }
                    Main.lock.unlock();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
