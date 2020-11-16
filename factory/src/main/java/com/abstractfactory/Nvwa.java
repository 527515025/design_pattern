package com.abstractfactory;

import com.abstractfactory.factory.FemaleFactory;
import com.abstractfactory.human.Human;
import com.abstractfactory.factory.HumanFactory;
import com.abstractfactory.factory.MaleFactory;

public class Nvwa {

	public static void main(String[] args) {
		// 第一条生产线生产男型
		HumanFactory maleFactory = new MaleFactory();
		// 第二条生产线，生产女性
		HumanFactory femaleFactory = new FemaleFactory();

		Human maleYellowHuman = maleFactory.createYellowHuman();
		Human femaleYellowHuman = femaleFactory.createYellowHuman();

		System.out.println("\n\n产生黄人男性－－－－－－－－－－－－－－－－－－－－－－－－－－");
		maleYellowHuman.getColor();
		maleYellowHuman.getSex();
		maleYellowHuman.talk();

		System.out.println("\n产生黄人美女－－－－－－－－－－－－－－－－－－－－－－－－－－");
		femaleYellowHuman.getColor();
		femaleYellowHuman.getSex();
		femaleYellowHuman.talk();
		
		Human maleWhiteHuman = maleFactory.createWhiteHuman();
		Human femaleWhiteHuman = femaleFactory.createWhiteHuman();
		System.out.println("\n\n产生白人男性－－－－－－－－－－－－－－－－－－－－－－－－－－");
		maleWhiteHuman.getColor();
		maleWhiteHuman.getSex();
		maleWhiteHuman.talk();
		System.out.println("\n产生白人美女－－－－－－－－－－－－－－－－－－－－－－－－－－");
		femaleWhiteHuman.getColor();
		femaleWhiteHuman.getSex();
		femaleWhiteHuman.talk();
		
		Human maleBlackHuman = maleFactory.createBlackHuman();
		Human femaleBlackHuman = femaleFactory.createBlackHuman();
		System.out.println("\n\n产生黑人男性－－－－－－－－－－－－－－－－－－－－－－－－－－");
		maleBlackHuman.getColor();
		maleBlackHuman.getSex();
		maleBlackHuman.talk();
		System.out.println("\n产生黑人美女－－－－－－－－－－－－－－－－－－－－－－－－－－");
		femaleBlackHuman.getColor();
		femaleBlackHuman.getSex();
		femaleBlackHuman.talk();
	}
}
