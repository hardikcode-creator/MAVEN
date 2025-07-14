package org.database;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Class> {

    @Override
    public Class mapRow(ResultSet rs, int rowNum) throws SQLException {
        Class student = new Class();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setAddress(rs.getString(3));
        return student;
    }
}
