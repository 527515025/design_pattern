package com.abel.currency;

/**
 * Created by yangyibo on 17/10/18.
 * 接收者，就是干活的角色，命令传递到这里应该被执行。类似我门example 里面的Group 的三个实现。
 */
public abstract class Receiver {
    // 抽象接受者，定义每个接收者都必须完成的业务
    public abstract void doSomething();
}
