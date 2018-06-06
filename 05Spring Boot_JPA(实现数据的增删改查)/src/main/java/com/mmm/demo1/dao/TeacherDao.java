package com.mmm.demo1.dao;

import com.mmm.demo1.bean.Teacher;
import org.springframework.data.repository.CrudRepository;


/**
 * CrudRepository<Teacher,Integer>
 *     第一个参数是需要操作的实体类的类型
 *     第二个参数是需要操作实体类的主键类型
 *
 *     CrudRepository接口中有对应的  增  删  查  方法
 */
public interface TeacherDao extends CrudRepository<Teacher,Integer>{


}

