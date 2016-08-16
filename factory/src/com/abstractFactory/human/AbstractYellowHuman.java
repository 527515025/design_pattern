package com.abstractFactory.human;

/**
 * 生产黄种人
 * @author yangyibo
 *相当于产品C车间
 */
public abstract class AbstractYellowHuman implements Human {

	public void getColor() {
		System.out.println("黄种人的肤色是黄色的");
	}

	/**
	 * 白种人讲话
	 */
	public void talk() {
		System.out.println("黄种人要说话了");
	}

}
