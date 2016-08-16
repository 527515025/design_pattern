package com.manyFactory.human;
import com.factory.human.Human;

/**
 * 女娲开始造人
 * 
 * @author yangyibo
 *
 */
public class Nvwa {
	public static void main(String[] args) {
		System.out.println("由于火候不够造出白种人");
		Human whiteHuman=(new WhiteHumanFactory()).createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("\n由于火候太大造出黑种人");
		Human blackHuman=(new BlackHumanFactory()).createHuman();
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("\n火候刚好造出黄种人");
		Human yellowHuman=(new YellowHumanFactory()).createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();

	}
}
