package org.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceInjection {
    private int x;
    private Student student1;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Student getStudent1() {
        return student1;
    }

    public void setStudent1(Student student1) {
        this.student1 = student1;
    }

    public ReferenceInjection(Student student1, int x) {
        this.student1 = student1;
        this.x = x;
    }

    @Override
    public String toString() {
        return "ReferenceInjection{" +
                "x=" + x +
                ", student1=" + student1 +
                '}';
    }

    public ReferenceInjection(){}

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Injection/refconfig.xml");
        ReferenceInjection obj = (ReferenceInjection) context.getBean("obj1");
        System.out.println("Student Name is-> "+obj.getStudent1().getStudentName());
        System.out.println(obj);
        System.out.println((ReferenceInjection)context.getBean("obj2"));
        System.out.println((ReferenceInjection)context.getBean("obj3"));
    }
}
