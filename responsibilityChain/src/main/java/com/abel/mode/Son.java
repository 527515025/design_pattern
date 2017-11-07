package com.abel.mode;

/**
 * Created by yangyibo on 17/11/7.
 */
public class Son implements IHandler {
    public void HandleMessage(IWomen women) {
        System.out.println("妈妈的请示是："+women.getRequest());
        System.out.println("儿子的回答： 同意");
    }
}
