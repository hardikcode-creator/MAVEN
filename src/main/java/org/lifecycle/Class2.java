package org.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Class2 implements InitializingBean, DisposableBean {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Class2(){}

    @Override
    public String toString() {
        return "Class2{" +
                "price=" + price +
                '}';
    }


    //like init method
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this is lifecycle of bean a custom init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("This is lifecycle end of bean and custom Destroy method");
    }

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Lifecycle/lifecycle2.xml");
        Class2 obj = (Class2) context.getBean("obj1");
        System.out.println(obj);
        context.registerShutdownHook();
    }
}
