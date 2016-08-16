package com.abstractFactory.human;

import com.abstractFactory.human.sex.FemaleBlackHuman;
import com.abstractFactory.human.sex.FemaleWhiteHuman;
import com.abstractFactory.human.sex.FemaleYellowHuman;

public class FemaleFactory implements HumanFatory{

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
