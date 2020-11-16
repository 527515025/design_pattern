package com.factory.human;

/**
 * 黄种人
 *
 * @author yangyibo
 */
public class YellowHuman implements Human {

    /**
     * 定义人肤色的特征
     */
    @Override
    public void getColor() {
        System.out.println("我是黄种人，我的皮肤是黄色的");
    }

    /**
     * 定义人说话特征
     */
    @Override
    public void talk() {
        System.out.println("我是黄种人我会说话");
    }
}
