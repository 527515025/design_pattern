package com.abel.solve;

import com.abel.problem.IWomen;

public class Grandson extends Handler{

    public Grandson(){
        super(Handler.GRANDSON_LEVEL_REQUEST);
    }

    //孙子的答复
    protected void response(IWomen women) {
        System.out.println("---奶奶向孙子请示---");
        System.out.println(women.getRequest());
        System.out.println("孙子的回答： 同意");

    }
}
