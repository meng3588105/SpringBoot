package com.mmm.demo1.bean;

public class Student {
    private int id;//编号
    private String name;//姓名

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

    public Student(int id, String name) {

        this.id = id;
        this.name = name;
    }
}
