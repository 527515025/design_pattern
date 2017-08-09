package com.abstractFactory.human.sex;

import com.abstractFactory.human.AbstractBlackHuman;

/**
 * 女黄种人
 * @author yangyibo
 *
 */
public class FemaleBlackHuman extends AbstractBlackHuman{

	@Override
	public void getSex() {
		System.out.println("黑人美女");
	}

}
