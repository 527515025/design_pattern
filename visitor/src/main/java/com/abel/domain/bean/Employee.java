package com.abel.domain.bean;

import com.abel.domain.IVisitor;

/**
 * 抽象员工类
 *
 * @author yyb
 * @time 2020/11/15
 */
public abstract class Employee {
    /**
     * 性别男
     */
    public final static int MALE = 0;
    /**
     * 性别女
     */
    public final static int FEMALE = 1;
    private String name;
    /**
     * xinzi
     */
    private int salary;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    /**
     * 允许访问者访问
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);
}
