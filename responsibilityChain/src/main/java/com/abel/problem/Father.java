package com.abel.problem;

/**
 * Created by yangyibo on 17/11/7.
 * 父亲类
 */
public class Father implements IHandler {

    //未出嫁的女儿的请示
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是："+women.getRequest());
        System.out.println("父亲的回答： 同意");

    }
}
