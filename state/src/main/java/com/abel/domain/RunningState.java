package com.abel.domain;

/**
 * @author yyb
 * @time 2020/11/15
 */
public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯运行");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        //设置为停止状态
        super.context.getLiftState().run();
    }
}
