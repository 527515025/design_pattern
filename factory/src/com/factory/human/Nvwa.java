package com.factory.human;

/**
 * 女娲开始造人了
 * 
 * @author yangyibo
 *
 */
public class Nvwa {
	public static void main(String[] args) {
		// 首先我要一个八卦炉
		AbstractHumanFactory baGuaLu=new HumanFactory();
		
		System.out.println("由于火候不够造出白种人");
		Human whiteHuman=baGuaLu.creatHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("\n由于火候太大造出黑种人");
		Human blackHuman=baGuaLu.creatHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("\n火候刚好造出黄种人");
		Human yellowHuman=baGuaLu.creatHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();

	}
}
