package com.abel.solve;

import com.abel.problem.IWomen;

public class Son extends Handler{

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }
    //儿子的答复
    protected void response(IWomen women) {
        System.out.println("---母亲向儿子请示---");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是： 同意");
    }
}
