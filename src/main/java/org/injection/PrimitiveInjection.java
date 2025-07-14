package org.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class PrimitiveInjection
{
    public static void main( String[] args )
    {

        ApplicationContext context =  new ClassPathXmlApplicationContext("Injection/primitive.xml");
       Student student1 =  (Student) context.getBean("student1");
        System.out.println(student1);
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);
    }
}
