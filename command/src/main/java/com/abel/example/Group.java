package com.abel.example;

/**
 * Created by yangyibo on 17/9/20.
 */
public abstract class Group {

    // 甲乙双方分开办公，如果要和某个组讨论问题，要先找到这个组
    public abstract void find();

    //被要求增加功能
    public abstract void add();

    //被要求删除功能
    public abstract void delete();

    //被要求改变功能
    public abstract void change();

    //被要求设计功能
    public abstract void plan();
}
