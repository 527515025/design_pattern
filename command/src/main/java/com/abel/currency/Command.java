package com.abel.currency;

/**
 * Created by yangyibo on 17/10/18.
 */
public abstract class Command {
    // 每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
