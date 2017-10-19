package com.abel.currency;

/**
 * Created by yangyibo on 17/10/18.
 */
public class ConcreteReciver1 extends Receiver {
    //每个接收者都必须处理一定的业务逻辑
    public void doSomething() {
        System.out.println("执行者1 ，执行命令");
    }
}
