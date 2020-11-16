package com.manyfactory.factory;

import com.factory.human.Human;

/**
 * 多工厂模式
 *
 * @author yangyibo
 */
public abstract class AbstractHumanFactory {
    /**
     * 创建人
     *
     * @return
     */
    public abstract Human createHuman();
}
