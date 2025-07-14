package org.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hibernate/config.xml");
        StudentDAO studentDAO = context.getBean("studentDAO",StudentDAO.class);
        Student student = new Student(3,"Hardik","Amravati");
        int r = studentDAO.insert(student);
        System.out.println(r);
        studentDAO.deleteStudent(1);

    }
}
