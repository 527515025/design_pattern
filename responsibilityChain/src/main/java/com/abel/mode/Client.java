package com.abel.mode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by yangyibo on 17/11/7.
 */
public class Client {
    public static void main(String[] args) {
        //随机生成几个女性
        Random rand = new Random();
        List<IWomen> womens = new ArrayList();
        for (int i = 0; i < 5; i++) {
            womens.add(new Women(rand.nextInt(4), "我要去逛街"));
        }
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for (IWomen women : womens) {
            if (women.getType() == 1) {
                // 未婚少女请示父亲
                System.out.println("\n--------女儿向父亲请示-------");
                father.HandleMessage(women);
            } else if (women.getType() == 2) {
                //已婚美女请示老公
                System.out.println("\n--------老婆向老公请示 -------");
                husband.HandleMessage(women);
            } else if (women.getType() == 3) {
                //妈妈向儿子
                System.out.println("\n--------妈妈向儿子请示-------");
                son.HandleMessage(women);
            } else {
                //暂时什么也不做
            }
        }
    }
}
