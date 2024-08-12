package com.mobile.innerclass;

public class Car {

    private String make;
    private String model;

    public Car() {
        this("Unknown", "Unknown");
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void altaMetoda() {
//        Adjust adjust = new Adjust(true, false, false);
    }

    public void enterCar() {
        System.out.println("Entered car " + Car.this.make + " " + Car.this.model);

        class Adjust {
            // SOC
            private boolean scaun;
            private boolean oglinzi;
            private boolean centuri;

            public Adjust(boolean scaun, boolean oglinzi, boolean centuri) {
                this.scaun = scaun;
                this.oglinzi = oglinzi;
                this.centuri = centuri;
            }

            static void ceva() {
//                System.out.println(this.scaun); // cannot do this
            }

            static class AdjustIntern {
            }

            @Override
            public String toString() {
                return "Adjust{" +
                        "scaun=" + scaun +
                        ", oglinzi=" + oglinzi +
                        ", centuri=" + centuri +
                        '}';
            }
        }

        Adjust adjust = new Adjust(true, false, false);
        System.out.println("Ce am ajustat: " + adjust);
        Adjust.ceva();
        adjust.ceva();

    }

    class Engine {

        static int numberOfEngines = 0;
        private int engineNo;
        private String model;

        public Engine(int engineNo, String model) {
            this.engineNo = engineNo;
            this.model = model;
            System.out.println("One more message: " + Car.this.make);
            numberOfEngines++;
        }

        public Engine(int engineNo) {
            this(engineNo, "8 cilindrii");
        }

        public void startEngine() {
            System.out.println("Started engine " + engineNo + " (engine model = " + this.model + ") for car " + make + " " + Car.this.model);
        }

        static int getNumberOfEngines() {
            return numberOfEngines;
        }
    }

    static int ceva = 7;

    static void staticMethod() {
        System.out.println(Car.ceva);
//        System.out.println(this.make); // can't do this
    }

    static class SteeringWheel {

        private String name;

        public SteeringWheel(String name) {
            this.name = name;
            System.out.println("Steering wheel constructor: " + name);
            System.out.println(Car.ceva);
//            System.out.println(Car.this.make);
        }

        void turnLeft() {
            System.out.println("Steering wheel " + name + " turning left");
        }

        void turnRight() {
            System.out.println("Steering wheel " + this.name + " turning right");
        }

        static void block() {
            System.out.println("Steering wheel blocked");
        }

    }
}
