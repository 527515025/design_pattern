package com.singleton.general;

/**
 * 普通单例模式
 * 饿汉单例模式
 * @author yangyibo
 *
 */
public class Singletion {
	private static final Singletion singletion = new Singletion();

	//私有的构造函数，其他类不能new出实例
	private Singletion() {
	}

	//通过该方法返回同一个实例
	public static Singletion getInstance() {
		return singletion;
	}
	
	/**
	 * 类中一些其他的方法，尽量用static
	 */
	public static void doSomething(){
	}
}
