package com.abstractFactory.human.sex;

import com.abstractFactory.human.AbstractWhiteHuman;

/**
 * 女黄种人
 * @author yangyibo
 *
 */
public class MaleWhiteHuman extends AbstractWhiteHuman{

	@Override
	public void getSex() {
		System.out.println("白人帅哥");
	}

}
