package org.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsInjection {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Injection/collections.xml");
        Employee emp = (Employee) context.getBean("employee1");
        System.out.println(emp);
    }


}
