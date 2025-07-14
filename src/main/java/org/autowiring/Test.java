package org.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiring/config.xml");
//        System.out.println(context.getBean("obj1"));
//        System.out.println(context.getBean("obj2"));
        System.out.println(context.getBean("obj3"));
    }
}
