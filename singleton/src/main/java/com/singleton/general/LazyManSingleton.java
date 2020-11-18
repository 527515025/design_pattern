package com.singleton.general;

/**
 * 懒汉单例模式
 * 高并发的时候可能会出现线程不安全情况
 * 例如线程1 执行到singletion = new Singletion2(); 但是没有执行成功
 * 线程2 执行singletion == null会返回true 造成线程不安全，
 * 所以用synchronized 关键字解决
 *
 * @author yangyibo
 */
public class LazyManSingleton {
    /**
     * 编译器有可能进行指令重排优化，使得singleton对象再未完成初始化之前就对其进行了赋值，这样其他人拿到的对象就可能是个残缺的对象了。使用volatile的目的是避免指令重排。保证先进性初始化，然后进行赋值
     */
    private volatile static LazyManSingleton lazyManSingleton = null;

    /**
     * 私有的构造函数，其他类不能new出实例
     */
    private LazyManSingleton() {
    }

    /**
     * 通过该方法返回同一个实例
     *
     * @return
     */
    public static synchronized LazyManSingleton getInstance() {
        if (lazyManSingleton == null) {
            lazyManSingleton = new LazyManSingleton();
        }

        return lazyManSingleton;
    }


    /**
     * 双重校验锁
     * 在JDK1.5之后，使用volatile关键字修饰instance就可以实现正确的double check单例模式了
     *
     * @return
     */
    public static LazyManSingleton getInstance2() {
        if (lazyManSingleton == null) {
            synchronized (LazyManSingleton.class) {
                if (lazyManSingleton == null) {
                    lazyManSingleton = new LazyManSingleton();
                }
            }
        }
        return lazyManSingleton;
    }


    /**
     * 类中一些其他的方法，尽量用static
     */
    public static void doSomething() {
    }
}
