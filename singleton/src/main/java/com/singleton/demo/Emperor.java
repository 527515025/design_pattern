package com.singleton.demo;

/**
 * 皇帝
 * <p>
 * 定义一个私有的构造函数，其他类不可以new出这个对象，
 * 其他类通过getInstance这个方法得到同一个对象实现单例
 * 饿汉
 *
 * @author yangyibo
 */
public class Emperor {
    /**
     * 初始化一个皇帝
     */
    private static final Emperor emperor = new Emperor();

    private Emperor() {
        // 定义一个私有的构造函数，其他类不可以new出这个对象
    }

    public static Emperor getInstance() {
        return emperor;
    }

    /**
     * 定义皇帝的一些功能
     */
    public void say() {
        System.out.println("皇帝发话了。。。。。。。我是皇帝XXX");
    }
}
