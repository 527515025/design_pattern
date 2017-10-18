package com.abel.example;

/**
 * Created by yangyibo on 17/9/20.
 * 需求组
 */
public class RequirementGroup extends Group {

    //客户要求需求组过去和他们谈
    public void find() {
        System.out.println("找到需求组");
    }

    //客户需要添加一项需求
    public void add() {
        System.out.println("客户要添加一项需求");
    }
    //客户需要删除一项需求
    public void delete() {
        System.out.println("客户要删除一项需求");
    }
    //客户需要修改一项需求
    public void change() {
        System.out.println("客户要修改一项需求");
    }
    //客户要求给出变更计划
    public void plan() {
        System.out.println("客户要求给出变更计划");
    }
}
