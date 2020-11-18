package com.singleton.general;


import com.singleton.general.bean.Emperor;

/**
 * 枚举实现单例
 *
 * 线程安全（枚举其实底层是依赖Enum类实现的，这个类的成员变量都是static类型的，并且在静态代码块中实例化的，和饿汉有点像,所以他天然是线程安全的。）
 * 以外，枚举还有一个好处，那就是"枚举可以解决反序列化会破坏单例的问题"
 *
 * @author yyb
 * @time 2020/11/18
 */
public enum SingletonEnum {
    EMPEROR;
    private Emperor emperor = null;

     SingletonEnum() {
         emperor = new Emperor();
    }

    public Emperor getEmperor() {
        return emperor;
    }
}
