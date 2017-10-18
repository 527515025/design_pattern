package com.abel.example;

/**
 * Created by yangyibo on 17/10/17.
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-----------客户要求增加一项需求---------------");
        Group rg = new RequirementGroup();
        //找到需求组
        rg.find();
        //添加一项需求
        rg.add();
        //给出变更计划
        rg.plan();

        System.out.println("\n\n-----------过了一天客户要删除一个页面---------------");
        Group pg = new PageGroup();
        pg.find();
        pg.delete();
        pg.plan();




    }
}
