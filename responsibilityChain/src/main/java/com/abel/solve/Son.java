package com.abel.solve;

import com.abel.problem.IWomen;

public class Son extends Handler{

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }
    protected void response(IWomen women) {
        System.out.println("女儿的请示是：");
        System.out.println(women.getRequest());
        System.out.println("丈夫的回答： 同意");
    }
}
