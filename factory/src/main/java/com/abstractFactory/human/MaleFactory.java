package com.abstractFactory.human;

import com.abstractFactory.human.sex.MaleBlackHuman;
import com.abstractFactory.human.sex.MaleWhiteHuman;
import com.abstractFactory.human.sex.MaleYellowHuman;

/**
 * 生产男人工厂
 * @author yangyibo
 *
 */
public class MaleFactory implements HumanFatory{

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
