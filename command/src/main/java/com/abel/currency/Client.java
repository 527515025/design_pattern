package com.abel.currency;

/**
 * Created by yangyibo on 17/10/19.
 */
public class Client {
    public static void main(String[] args) {
        // 指定接头人
        Invoker invoker = new Invoker();
        // 指定执行者
        Receiver receiver = new ConcreteReciver1();
        // 发布命令
        Command command = new ConcreteCommand1(receiver);
        // 执行
        invoker.setCommand(command);
        invoker.action();
    }
}
