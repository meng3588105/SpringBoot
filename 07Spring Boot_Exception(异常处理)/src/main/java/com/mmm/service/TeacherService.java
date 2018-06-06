package com.mmm.service;

import com.mmm.bean.Teacher;
import com.mmm.dao.TeacherDao;
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
