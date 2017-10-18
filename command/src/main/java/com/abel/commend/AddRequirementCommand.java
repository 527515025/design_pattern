package com.abel.commend;

/**
 * Created by yangyibo on 17/10/18.
 *
 * 需求组添加需求
 */
public class AddRequirementCommand extends Command {

    public void execute() {
        //找到需求组
        super.rg.find();
        //添加需求
        super.rg.add();
        //给出计划
        super.rg.plan();
    }
}

