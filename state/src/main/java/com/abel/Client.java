package com.abel;

import com.abel.domain.ClosingState;
import com.abel.domain.Context;

/**
 * @author yyb
 * @time 2020/11/15
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        //定义初始状态
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
