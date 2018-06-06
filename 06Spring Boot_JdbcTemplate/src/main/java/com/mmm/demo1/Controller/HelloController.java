package com.mmm.demo1.Controller;

import com.mmm.demo1.bean.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController //@RestController 和 @ResponseBody
public class HelloController {
    /**
     * @RequestMapping("/hello")  设置我们的请求地址
     *
     * http://localhost:8080/hello
     */
    @RequestMapping("/hello")
    public String hello(){
    System.out.println("进入了 hello");
    return "我是谁？我是 呵呵";
    }

    /**
     * 我们虽然返回是一个对象，但是springboot底层继承了jackson
     * 会把我们的对象转换成json格式的数据之后进行返回
     * @return
     */
    @RequestMapping("/getStudent")

    public Student getStudent(){
        Student student =new Student(111,"的地方",new Date());
        return student;

    }

/*    *//**
     * 验证返回一个list集合
     * @return
     *//*
    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        List<Student> students =new ArrayList<Student>();//创建集合
        Student student1=new Student(111,"呵呵怪list1");
        Student student2=new Student(222,"呵呵怪list2");
        Student student3=new Student(333,"呵呵怪list3");
        Student student4=new Student(444,"呵呵怪list4");

        //集合中新增数据
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        return students;

    }

    *//**
     * 验证返回一个set集合
     * @return
     *//*
    @RequestMapping("/getStudentsBySet")
    public Set<Student> getStudentsBySet(){
        Set<Student> students =new HashSet<Student>();//创建集合
        Student student1=new Student(111,"呵呵怪set111");
        Student student2=new Student(222,"呵呵怪set222");
        Student student3=new Student(333,"呵呵怪set333");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        return students;
    }

    *//**
     * 验证返回一个Map集合
     * @return
     *//*
    @RequestMapping("/getStudentsByMap")
    public Map<String,Student> getStudentsBuMap(){

        Map<String,Student> stus=new HashMap<String,Student>();//创建集合
        Student stu1=new Student(111,"呵呵怪map111");
        Student stu2=new Student(222,"呵呵怪map222");
        Student stu3=new Student(333,"呵呵怪map333");

        stus.put("1",stu1);
        stus.put("2",stu2);
        stus.put("3",stu3);
        return stus;
    }*/

}
