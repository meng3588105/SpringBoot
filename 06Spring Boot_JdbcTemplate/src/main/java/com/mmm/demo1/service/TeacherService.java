package com.mmm.demo1.service;

import com.mmm.demo1.bean.Teacher;
import com.mmm.demo1.dao.TeacherDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class TeacherService {
    @Resource //注入dao层对象 默认名称匹配
    private TeacherDao teacherDao;

    public Teacher selectByTeacherName(String teacherName){
        return teacherDao.selectByTeacheName(teacherName);
    }


}
