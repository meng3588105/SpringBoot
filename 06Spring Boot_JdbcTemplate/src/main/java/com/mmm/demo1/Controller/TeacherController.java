package com.mmm.demo1.Controller;


import com.mmm.demo1.bean.Teacher;
import com.mmm.demo1.service.TeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class TeacherController {
    @Resource//注入servvice层对象
    private TeacherService teacherService;

    @RequestMapping("/selectByTeacherName")
    public Teacher selectByTeacherName(String teacherName){
        return teacherService.selectByTeacherName(teacherName);
    }

}
