package com.abel.domain;

import com.abel.domain.bean.CommonEmployee;
import com.abel.domain.bean.Employee;
import com.abel.domain.bean.Manager;

/**
 * 访问者，需要不同的展示方式则定义不同的访问者
 *
 * @author yyb
 * @time 2020/11/15
 */
public class Visitor implements IVisitor {
    /**
     * 访问普通员工
     *
     * @param commonEmployee
     */
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    /**
     * 访问部门经理
     *
     * @param manager
     */
    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBasicInfo(Employee employee) {
        String info = "name ：" + employee.getName() + "\t";
        info = info + "sex：" + (employee.getSex() == Employee.FEMALE ? " 男" : "女") + "\t";
        info = info + "salary：" + employee.getSalary() + "\t";
        return info;
    }

    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "performance：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "job：" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}
