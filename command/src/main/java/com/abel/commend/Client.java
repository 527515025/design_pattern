package com.abel.commend;

/**
 * Created by yangyibo on 17/10/18.
 */
public class Client {
    public static void main(String[] args) {
        // 定义接头人 sb
        Invoker sb = new Invoker();
        System.out.println("------------客户要求增加一个需求---------------");
        //客户下命令
//        Command command = new AddRequirementCommand();
        //删除页面命令
        Command command = new DeletePageCommand();
        //sb收到命令
        sb.setCommand(command);
        //sb 执行命令
        sb.action();
    }
}
