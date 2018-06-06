package com.mmm.Controller;


import com.mmm.bean.Teacher;
import com.mmm.service.TeacherService;
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
