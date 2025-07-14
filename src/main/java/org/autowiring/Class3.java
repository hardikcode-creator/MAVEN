package org.autowiring;

import org.lifecycle.Class2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Class3 {

    private double price;

    @Autowired
    private Class1 class1;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Class1 getClass1() {
        return class1;
    }

    public void setClass1(Class1 class1) {
        this.class1 = class1;
    }

    public Class3(double price, Class1 class1) {
        this.price = price;
        this.class1 = class1;
    }

    public Class3() {
    }

    @Override
    public String toString() {
        return "Class3{" +
                "price=" + price +
                ", class1=" + class1 +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiring/annotation.xml");
//        System.out.println(context.getBean("obj1"));
//        System.out.println(context.getBean("obj2"));
        System.out.println((Class3)context.getBean("obj3"));
    }
}
