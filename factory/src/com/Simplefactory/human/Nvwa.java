package com.Simplefactory.human;

import com.factory.human.BlackHuman;
import com.factory.human.Human;
import com.factory.human.WhiteHuman;
import com.factory.human.YellowHuman;

/**
 * 简单工厂模式
 * 
 * @author yangyibo
 *
 */
public class Nvwa {
	public static void main(String[] args) {
		//我就一个八卦炉，所以不用生产八卦炉了。
		System.out.println("由于火候不够造出白种人");
		Human whiteHuman=HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("\n由于火候太大造出黑种人");
		Human blackHuman=HumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("\n火候刚好造出黄种人");
		Human yellowHuman=HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();

	}
}
