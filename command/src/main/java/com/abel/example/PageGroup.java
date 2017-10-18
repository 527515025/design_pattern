package com.abel.example;

/**
 * Created by yangyibo on 17/9/20.
 * 美工组
 */
public class PageGroup extends Group {
    //客户要找到美工组过去和他们谈
    public void find() {
        System.out.println("找到美工组");
    }
    //美工被要求增加一个页面
    public void add() {
        System.out.println("美工被要求增加一个页面");
    }
    //美工被要求删除一个页面
    public void delete() {
        System.out.println("美工被要求删除一个页面");
    }
    //美工被要求修改一个页面
    public void change() {
        System.out.println("美工被要求修改一个页面");
    }
    //所有的增、删、改都要给出计划
    public void plan() {
        System.out.println("要求美工组所有的增、删、改都要给出计划");
    }
}
