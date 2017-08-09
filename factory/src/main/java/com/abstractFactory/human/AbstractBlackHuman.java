package com.abstractFactory.human;

/**
 * 生产黑人
 * @author yangyibo
 *相当于产品A车间
 */
public abstract class AbstractBlackHuman implements Human {

	public void getColor() {
		System.out.println("黑种人的肤色是黑色的");
	}

	/**
	 * 白种人讲话
	 */
	public void talk() {
		System.out.println("黑种人要说话了");
	}

}
