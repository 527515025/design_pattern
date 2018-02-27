package com.abel.solve;

import com.abel.problem.IWomen;

public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    //丈夫的答复
    protected void response(IWomen women) {
        System.out.println("女儿的请示是：");
        System.out.println(women.getRequest());
        System.out.println("丈夫的回答： 同意");
    }
}
