package com.factory.human;

/**
 * 抽象人类工厂
 * @author yangyibo
 *
 */
public abstract class AbstractHumanFactory {
	/**
	 * 
	 * @param T  输入参数必须是Class型， 必须是Human的实现类
	 * @return
	 */
	public abstract <T extends Human> T creatHuman(Class<T> T);
}
