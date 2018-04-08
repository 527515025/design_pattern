package com.abel.solve;

import com.abel.problem.IWomen;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        //生成请求
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));

        }

        //构建责任链
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        Handler grandson = new Grandson();
        father.setNext(husband);
        husband.setNext(son);
        son.setNext(grandson);

        //处理请求
        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        }
    }
}
