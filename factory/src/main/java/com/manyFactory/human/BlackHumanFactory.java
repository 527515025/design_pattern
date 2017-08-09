package com.manyFactory.human;

import com.factory.human.BlackHuman;
import com.factory.human.Human;

/**
 * 生产黑种人，并初始化黑种人的一些特定属性
 * @author yangyibo
 *
 */
public class BlackHumanFactory extends AbstractHumanFactory{
	@Override
	public Human createHuman() {
		return new BlackHuman();
	}
}
