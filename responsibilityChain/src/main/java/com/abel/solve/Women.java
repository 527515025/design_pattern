package com.abel.solve;

import com.abel.problem.IWomen;

public class Women implements IWomen {

    private int type = 0;
    private String request;

    public Women(int type, String request) {
        this.type = type;
        switch (type) {
            case 0:
                this.request = "女儿的请求是：" + request;
                break;
            case 1:
                this.request = "妻子的请求是：" + request;
                break;
            case 2:
                this.request = "母亲的请求是：" + request;
                break;
            case 3:
                this.request = "奶奶的请求是：" + request;
        }
    }

    public int getType() {
        return this.type;
    }

    public String getRequest() {
        return this.request;
    }
}
