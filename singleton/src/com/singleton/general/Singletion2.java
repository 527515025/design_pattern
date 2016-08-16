package com.singleton.general;

/**
 * 懒汉单例模式
 * 高并发的时候可能会出现线程不安全情况
 * 例如线程1 执行到singletion = new Singletion2(); 但是没有执行成功
 * 线程2 执行singletion == null会返回true 造成线程不安全，
 * 所以用synchronized 关键字解决
 * @author yangyibo
 *
 */
public class Singletion2  {
	private static Singletion2 singletion = null;

	// 私有的构造函数，其他类不能new出实例
	private Singletion2() {
	}

	// 通过该方法返回同一个实例
	public  static synchronized Singletion2 getInstance() {
		if (singletion == null) {
			singletion = new Singletion2();
	}	
		
		return singletion;
	}

	/**
	 * 类中一些其他的方法，尽量用static
	 */
	public static void doSomething() {
	}
}
