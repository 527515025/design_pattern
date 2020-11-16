package com.abstractfactory.factory;

import com.abstractfactory.human.Human;
import com.abstractfactory.human.sex.MaleBlackHuman;
import com.abstractfactory.human.sex.MaleWhiteHuman;
import com.abstractfactory.human.sex.MaleYellowHuman;

/**
 * 生产男人工厂
 * @author yangyibo
 *
 */
public class MaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

}
