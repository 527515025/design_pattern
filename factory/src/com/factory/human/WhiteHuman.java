package com.factory.human;

/**
 * 白种人
 * @author yangyibo
 *
 */
public class WhiteHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("我是白种人，我的皮肤是白色的");
	}

	@Override
	public void talk() {
		System.out.println("我是白种人我会说话");
	}

}
