package com.abel;

import com.abel.domain.Visitor;
import com.abel.domain.bean.CommonEmployee;
import com.abel.domain.bean.Employee;
import com.abel.domain.bean.Manager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yyb
 * @time 2020/11/15
 */
public class Client {
    public static void main(String[] args) {
        for (Employee emp : mockEmployee()) {
            emp.accept(new Visitor());
        }
    }

    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<>();
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("搬砖");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("开车");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("ppt");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
