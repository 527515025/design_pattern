package com.simplefactory.human;

import com.factory.human.Human;

/**
 * 简单工厂模式，只有一个工厂
 * 也叫静态工厂模式。因为生产人的方法是静态的
 *
 * @author yangyibo
 *         只有一个工厂，
 */
public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> T) {
        Human human = null;
        try {
            human = (T) Class.forName(T.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
