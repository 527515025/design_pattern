package com.abel.currency;

/**
 * Created by yangyibo on 17/10/18.
 */
public class Invoker {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        System.out.println("开始执行命令");
        this.command.execute();
        System.out.println("命令执行结束");

    }
}
