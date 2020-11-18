package com.singleton.general;

/**
 * 普通单例模式
 * 饿汉单例模式
 *
 * @author yangyibo
 */
public class HungryManSingleton {
    private static final HungryManSingleton HUNGRY_MAN_SINGLETON = new HungryManSingleton();

    /**
     * 私有的构造函数，其他类不能new出实例
     */
    private HungryManSingleton() {
    }

    /**
     * 通过该方法返回同一个实例
     *
     * @return
     */
    public static HungryManSingleton getInstance() {
        return HUNGRY_MAN_SINGLETON;
    }

    /**
     * 类中一些其他的方法，尽量用static
     */
    public static void doSomething() {
    }
}
