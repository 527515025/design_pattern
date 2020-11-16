package com.manyfactory.factory;

import com.factory.human.Human;
import com.factory.human.WhiteHuman;

/**
 * 生产白种人，并初始化白种人的一些特定属性
 * @author yangyibo
 *
 */
public class WhiteHumanFactory extends AbstractHumanFactory{
	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}
}
