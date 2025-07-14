package org.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Injection/constructorinjection.xml");
        System.out.println((Person)context.getBean("person1"));
        System.out.println((Person)context.getBean("person2"));
    }
}
