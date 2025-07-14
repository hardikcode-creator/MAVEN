package org.database;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDao {
    private JdbcTemplate jdbcTemplate;


    public int insert(Class student){
        String query = "insert into student(id,name,address) values (?,?,?)";
           int r =  this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
            return r;
    }
    public int change(Class student){
        String query = "update student set name=? , address=? where id=?";
        int result = this.jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getId());
        return result;
    }

    public Class getStudent(int studentId){
        String query = "select * from student where id = ?";
        RowMapper<Class> rowMapper = new RowMapperImpl();
        Class student =this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
        return student;
    }

    public List<Class> getStudents(String name){
        String query = "select * from student where name=?";
        List<Class> students  = this.jdbcTemplate.query(query, new RowMapper<Class>() {
            @Override
            public Class mapRow(ResultSet rs, int rowNum) throws SQLException {
                Class student = new Class();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setAddress(rs.getString(3));
                return student;
            }
        },name);
                return students;
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
