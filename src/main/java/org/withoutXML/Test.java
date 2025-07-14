package org.withoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        Class1 student = context.getBean("class1", Class1.class);
        System.out.println(student);

        //Testing bean scope -> Prototype
        Class1 student2  = context.getBean("class1", Class1.class);
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
    }
}
