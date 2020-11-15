package com.abel.domain.bean;

import com.abel.domain.IVisitor;

/**
 * @author yyb
 * @time 2020/11/15
 */
public class CommonEmployee extends Employee {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 允许访问者访问
     *
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
