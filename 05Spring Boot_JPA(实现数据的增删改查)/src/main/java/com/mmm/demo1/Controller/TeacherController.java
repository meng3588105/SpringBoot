package com.mmm.demo1.Controller;


import com.mmm.demo1.bean.Teacher;
import com.mmm.demo1.service.TeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource//注入servvice层对象
    private TeacherService teacherService;

    @RequestMapping("/add")
    public String add(){
        System.out.println("进入了add（）");
        teacherService.add(new Teacher("大力娜","西二旗"));
        return "add success";
    }
    @RequestMapping("/del")
    public String del(){
        System.out.println("进入了del（）");
        teacherService.del(2);//删除编号为1的
        return "del success";
    }

    @RequestMapping("/getAll")
    public Iterable<Teacher> getAll(){
        System.out.println("进入了getAll（）");
        Iterable<Teacher> teachers=teacherService.getAll();
        return teachers;
    }


}
