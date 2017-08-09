package com.abstractFactory.human;

/**
 * 生产白人
 * @author yangyibo
 *相当于产品B车间
 */
public abstract class AbstractWhiteHuman implements Human {

	public void getColor() {
		System.out.println("白种人的肤色是白色的");
	}

	/**
	 * 白种人讲话
	 */
	public void talk() {
		System.out.println("白种人要说话了");
	}

}
