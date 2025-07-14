package org.autowiring;

public class Class2 {

    private Class1 class1;
    private double price;
    public Class1 getClass1() {
        return class1;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "class1=" + class1 +
                ", price=" + price +
                '}';
    }


    public void setClass1(Class1 class1) {
        this.class1 = class1;
    }

    public Class2(Class1 class1) {
        this.class1 = class1;

    }

    public Class2(Class1 class1, double price) {
        this.class1 = class1;
        this.price = price;
    }
}
