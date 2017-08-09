package com.abstractFactory.human.sex;

import com.abstractFactory.human.AbstractYellowHuman;

/**
 * 女黄种人
 * @author yangyibo
 *
 */
public class MaleYellowHuman extends AbstractYellowHuman{

	@Override
	public void getSex() {
		System.out.println("黄人帅哥");
	}

}
