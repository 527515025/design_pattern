package com.abel.solve;

import com.abel.problem.IWomen;

/**
 * Created by yangyibo on 2018/1/25.
 */
public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    // 父亲的答复
    protected void response(IWomen women) {
        System.out.println("---女儿向父亲请示---");
        System.out.println(women.getRequest());
        System.out.println("父亲的回答： 同意");
    }
}
