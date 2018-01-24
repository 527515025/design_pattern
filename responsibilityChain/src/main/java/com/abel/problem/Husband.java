package com.abel.problem;

/**
 * Created by yangyibo on 17/11/7.
 * 丈夫类
 */
public class Husband implements IHandler {
    public void HandleMessage(IWomen women) {
        System.out.println("老婆的请示是："+women.getRequest());
        System.out.println("丈夫的回答： 同意");
    }
}
