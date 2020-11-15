package com.abel.domain;

import com.abel.domain.bean.CommonEmployee;
import com.abel.domain.bean.Manager;

/**
 * 定义访问者接口
 *
 * @author yyb
 * @time 2020/11/15
 */
public interface IVisitor {
    /**
     * 访问普通员工
     * @param commonEmployee
     */
    public void visit(CommonEmployee commonEmployee);

    /**
     * 访问部门经理
     * @param manager
     */
    public void visit(Manager manager);
}
