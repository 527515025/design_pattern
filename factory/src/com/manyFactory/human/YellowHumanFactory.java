package com.manyFactory.human;

import com.factory.human.Human;
import com.factory.human.YellowHuman;

/**
 * 生产黄种人，并初始化黄种人的一些特定属性
 * @author yangyibo
 *
 */
public class YellowHumanFactory extends AbstractHumanFactory{

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
