package com.manyFactory.human;

import com.factory.human.Human;

/**
 * 多工厂模式
 * 
 * @author yangyibo
 *
 */
public abstract class AbstractHumanFactory {
	public abstract Human createHuman();
}
