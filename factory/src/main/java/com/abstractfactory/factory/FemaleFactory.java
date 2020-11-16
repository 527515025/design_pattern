package com.abstractfactory.factory;

import com.abstractfactory.human.Human;
import com.abstractfactory.human.sex.FemaleBlackHuman;
import com.abstractfactory.human.sex.FemaleWhiteHuman;
import com.abstractfactory.human.sex.FemaleYellowHuman;

/**
 * 生产女人工厂
 */
public class FemaleFactory implements HumanFatory {

	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

}
