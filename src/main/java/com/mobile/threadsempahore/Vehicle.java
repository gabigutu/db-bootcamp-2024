package com.mobile.threadsempahore;

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
                semaphoreNS.acquire(); // 0 permits
                    // 9812, 543, 888
                    System.out.println("|||||NS||||| Vehicle " + getName() + " is passing intersection from North to South (no Permits = " + semaphoreNS.availablePermits() + ") ");
                    if (semaphoreNS.availablePermits() == 0) {
                        // 615, 222, 90, 11, 34, 52, 10
                        System.out.println("=======================================");
                        semaphoreWE.release(10);
                    }
            } else { // orizontala (77, 65, ...)
                semaphoreWE.acquire(); // 0 permit-uri
                    System.out.println("===WE=== Vehicle " + getName() + " is passing intersection from West to East (no Permits = " + semaphoreWE.availablePermits() + ") ");
                if(semaphoreWE.availablePermits() == 0) {
                    System.out.println("||||||||||||||||||||||||||||||||||||||");
                    semaphoreNS.release(10);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
