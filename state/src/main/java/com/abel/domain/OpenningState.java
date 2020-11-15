package com.abel.domain;

/**
 * 开门状态
 *
 * @author yyb
 * @time 2020/11/15
 */
public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门打开了");

    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closeingState);
        super.context.getLiftState().close();

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
