package org.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Class1 {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting the value");
        this.price = price;
    }

    public Class1(double price) {
        this.price = price;
    }
    public Class1(){

    }

    @Override
    public String toString() {
        return "Class1{" +
                "price=" + price +
                '}';
    }

    public static void main(String[] args) {
        AbstractApplicationContext context  = new ClassPathXmlApplicationContext("Lifecycle/lifecycle.xml");
        Class1 obj = (Class1) context.getBean("obj1");
        System.out.println(obj);
        //registering the shutdown hooke
        context.registerShutdownHook();
    }
    public void init(){
        System.out.println("Inside init method");
    }
    public void destroy(){
        System.out.println("Inside destory method");
    }
}
