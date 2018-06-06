package com.mmm.dao;


import com.mmm.bean.Teacher;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository  //标识  这是一个持久化操作的类
public class TeacherDao {

    @Resource //注入模板
    private JdbcTemplate jdbcTemplate;

    public Teacher selectByTeacheName(String teacherName){
        /**
         * 01.定义sql语句
         * 02.定义RowMapper
         * 03.执行查询方法
         */
        String sql="select * from teacher where t_Name=?";
        RowMapper<Teacher> rowMapper=new BeanPropertyRowMapper<Teacher>(Teacher.class);
        Teacher teacher=jdbcTemplate.queryForObject(sql,rowMapper,teacherName);

        return teacher;

    }

}
