package com.abel.commend;

/**
 * Created by yangyibo on 17/10/18.
 */
public class DeletePageCommand extends Command {
    public void execute() {
        // 找到美工组
        super.pg.find();
        //删除一个页面
        super.rg.delete();
        // 给出计划
        super.rg.plan();

    }
}
