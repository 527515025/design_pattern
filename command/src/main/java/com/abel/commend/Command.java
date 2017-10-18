package com.abel.commend;

import com.abel.example.CodeGroup;
import com.abel.example.PageGroup;
import com.abel.example.RequirementGroup;

/**
 * Created by yangyibo on 17/10/17.
 * 抽象命令类
 *
 * 根据字符串判断相关业务逻辑不是一个非常友好的方案，应该对发出的string 进行封装，每个命令就是一个对象，避免交流误差。
 */
public abstract class Command {
    //把三个组都定义好，子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup(); // 需求组
    protected PageGroup pg = new PageGroup(); //美工组
    protected CodeGroup cg = new CodeGroup(); // 代码组

    public abstract void execute();
}
