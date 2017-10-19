package com.abel.currency;

/**
 * Created by yangyibo on 17/10/18.
 */
public class ConcreteCommand2 extends Command {

    //对 receiver 类命令处理
    private Receiver receiver;

    //构造函数传递接收者
    public ConcreteCommand2(Receiver _receiver) {
        this.receiver = _receiver;
    }

    public void execute() {
        //业务处理
        this.receiver.doSomething();
        System.out.println("执行命令2");
    }
}
