package com.mmm.demo1.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * 当jpa检测到我们的实体类中有@Entity注解的时候
 * 就会在数据库汇总生成对应的表结构
 */
@Entity
public class Teacher {
    /**
     * 设置主键以及生成策略
     * mysql默认是主键自增
     */

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tId;//教师编号
    private String tName;//教师姓名
    private String tAddress;//教师住址

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tAddress='" + tAddress + '\'' +
                '}';
    }

    public Teacher() {

    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    public Teacher(String tName, String tAddress) {

        this.tName = tName;
        this.tAddress = tAddress;
    }
}
