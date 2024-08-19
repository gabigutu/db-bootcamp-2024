package com.mobile.design_patterns.factory;

/* A Company that Makes Everything */
public class ACME {

    String factoryName;

    public ACME(String factoryName) {
        this.factoryName = factoryName;
    }

    enum ProductType {
        CAR,
        LAPTOP,
        PEN
    }

    public Product getProduct(ProductType type) {
        switch (type) {
            case CAR:
                return new Car();
            case LAPTOP:
                return new Laptop();
            case PEN:
                // ...
                break;
        }
        return null;
    }

    public static void main(String[] args) {
        ACME fabrica1 = new ACME("Fabrica cu de toate");
        Product car1 = fabrica1.getProduct(ProductType.CAR);
        ((Car) car1).startEngine(); // ??
        Product laptop1 = fabrica1.getProduct(ProductType.LAPTOP);
        System.out.println("Car1: " + car1);
        System.out.println("Laptop1: " + laptop1);
        ((Laptop) laptop1).boot();


        ACME fabrica2 = new ACME("Alta fabrica, doar cu masini");
        Product car2 = fabrica1.getProduct(ProductType.CAR); // diferit
        if (car2 instanceof Laptop) {
            ((Laptop) car2).boot();
        }
        Product car3 = fabrica1.getProduct(ProductType.CAR); // diferit
        System.out.println("Car2: " + car2);
        System.out.println("Car3: " + car3);
    }

}
