package com.abel.commend;

/**
 * Created by yangyibo on 17/10/18.
 */
public class Invoker {
    // 客户发送的命令
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    // 执行客户的命令
    public void action(){
        this.command.execute();
    }
}
