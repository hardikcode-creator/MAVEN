package org.database;

import org.injection.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

    public static void main(String[] args) {
        System.out.println("HELLO WORLD");

        ApplicationContext context = new ClassPathXmlApplicationContext("database/config.xml");
       StudentDao studentDao =  context.getBean("studentDAO", StudentDao.class);
       Class student = new Class();
       student.setId(6);
       student.setName("temp");
       student.setAddress("Kerala");
//       int result = studentDao.insert(student);
//        System.out.println(result);

        // update query
        student.setName("Harsh");
        int res = studentDao.change(student);

        System.out.println(res);

        //select query
        System.out.println(studentDao.getStudent(1));
        // select query
        System.out.println(studentDao.getStudents("temp"));
    }
}
