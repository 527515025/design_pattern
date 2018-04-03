package com.abel.solve;

import com.abel.problem.IWomen;

/**
 * Created by yangyibo on 2018/1/24.
 */
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    public final static int GRANDSON_LEVEL_REQUEST = 4;

    //当前能处理的等级
    private int level;
    //下一个责任人
    private Handler nextHandler;

    public Handler(int level){
        this.level = level;
    }

    /**
     * 一个女人要求逛街、等请求，需要处理
     * 此处用到模版方法模式，在模版方法中判断请求的级别和当前能够处理的级别，如果相同则调用基本方法，作出反馈，如果不相等则传递到下一环节
     * @param women
     */
    public final void HandleMessage(IWomen women){
        if(women.getType() == this.level){
            response(women);
        }else{
            if(null != this.nextHandler) {
               // 有后续环节，将请求传递
                this.nextHandler.HandleMessage(women);
            }else{
                // 无后续环节。
                System.out.println("---没有后续环节，默认不同意---\n");
            }
        }
    }

    /**
     * 找下一个环节的责任人
     * @param _handler
     */
    public void setNext(Handler _handler){
        this.nextHandler = _handler;
    }

    //有请示就要有回应
    protected abstract void response(IWomen women);
}
