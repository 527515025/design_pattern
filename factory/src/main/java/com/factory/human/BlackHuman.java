package com.factory.human;

/**
 * 黑种人
 * 
 * @author yangyibo
 *
 */
public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("我是黑种人，我的皮肤是黑色的");
	}

	@Override
	public void talk() {
		System.out.println("我是黑种人我会说话");
	}

}
