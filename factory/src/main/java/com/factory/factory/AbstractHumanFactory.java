package com.factory.factory;

import com.factory.human.Human;

/**
 * 抽象人类工厂
 *
 * @author yangyibo
 */
public abstract class AbstractHumanFactory {
    /**
     * 创建一个人
     *
     * @param T 输入参数必须是Class型， 必须是Human的实现类
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> T);
}
