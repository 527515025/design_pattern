package com.abel.domain.bean;

import com.abel.domain.IVisitor;

/**
 * @author yyb
 * @time 2020/11/15
 */
public class Manager extends Employee {
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
