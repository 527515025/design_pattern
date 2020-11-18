package com.singleton.extend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 单例扩展， 通过静态代码块和静态方法实现单例
 *  饿汉
 * @author yangyibo
 */
public class Emperor {
    /**
     * 定义最多产生的实例数
     */
    private static int maxNumOfEmperor = 2;
    /**
     * 定义每个皇帝的名字，容纳每个实例的似有属性
     */
    private static List<String> nameList = new ArrayList<String>();
    /**
     * 容纳所有皇帝实例
     */
    private static List<Emperor> emperorList = new ArrayList<Emperor>();
    /**
     * 定义当前皇帝序列号
     */
    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇帝" + i + "世"));
        }
    }

    private Emperor() {
    }

    /**
     * 传入皇帝名称建立皇帝对象
     * @param name
     */
    private Emperor(String name) {
        nameList.add(name);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        //随机拉出一个皇帝
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    /**
     * 定义皇帝的一些功能
     */
    public void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
