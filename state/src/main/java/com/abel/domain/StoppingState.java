package com.abel.domain;

/**
 * @author yyb
 * @time 2020/11/15
 */
public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        //设置为停止状态
        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        //设置为停止状态
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }
}
