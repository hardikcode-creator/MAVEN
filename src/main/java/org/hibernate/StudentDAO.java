package org.hibernate;

import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDAO {

    private HibernateTemplate hibernateTemplate ;

    @Transactional
    public int insert(Student student){

       Integer result = (Integer) this.hibernateTemplate.save(student);
        return result;

    }

    public Student getStudent(int id){
        Student student = this.hibernateTemplate.get(Student.class,id);
        return student;
    }
    public List<Student> getStudents(){
        List<Student> students = this.hibernateTemplate.loadAll(Student.class);
        return students;
    }

    @Transactional
    public void deleteStudent(int id){

        Student student = this.getStudent(id);
        this.hibernateTemplate.delete(student);
    }

    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public StudentDAO(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    public StudentDAO(){}
}
