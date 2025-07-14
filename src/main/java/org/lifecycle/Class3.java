package org.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Class3 {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Class3(){}

    @Override
    public String toString() {
        return "Class3{" +
                "price=" + price +
                '}';

    }

    //using annotations
    @PostConstruct
    public void start(){
        System.out.println("init method");
    }
    @PreDestroy
    public void end(){
        System.out.println("destroy method");
    }
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Lifecycle/lifecycle3.xml");
        context.registerShutdownHook();
        Class3 obj = (Class3) context.getBean("obj1");
        System.out.println(obj);

    }
}
