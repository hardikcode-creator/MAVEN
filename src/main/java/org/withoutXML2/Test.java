package org.withoutXML2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        Class1 student = context.getBean("getClass1", Class1.class);
        System.out.println(student);
        student.getSamosa().display();

    }
}
