package org.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Class2 {

    private double price;


    //As there are 2 beans of class1 this gets confused so we use qualifier

    @Autowired
    @Qualifier("obj1")
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

    public Class2(double price, Class1 class1) {
        this.price = price;
        this.class1 = class1;
    }

    public Class2() {
    }

    @Override
    public String toString() {
        return "Class2{" +
                "price=" + price +
                ", class1=" + class1 +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("qualifier/config.xml");
        System.out.println((Class2)context.getBean("obj2"));
    }
}
