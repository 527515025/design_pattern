package com.abstractFactory.human.sex;

import com.abstractFactory.human.AbstractYellowHuman;

/**
 * 女黄种人
 * @author yangyibo
 *相当于产品C1
 */
public class FemaleYellowHuman extends AbstractYellowHuman{

	@Override
	public void getSex() {
		System.out.println("黄人美女");
	}

}
