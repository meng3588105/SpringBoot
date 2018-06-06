package com.mmm.demo1.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Student {
    //编号将不会 随对象 返回前台给用户
    @JSONField(serialize = false)
    private int id;//编号


    private String name;//姓名


    //import com.alibaba.fastjson.annotation.JSONField;
    @JSONField(format="yyyy-MM-dd")
    private Date time;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Student(int id, String name, Date time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }
}
