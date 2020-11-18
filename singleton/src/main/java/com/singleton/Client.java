package com.singleton;

import com.singleton.general.CasSingleton;

/**
 * @author yyb
 * @time 2020/11/18
 */
public class Client {
    public static void main(String[] args) {
        CasSingleton casSingleton = new CasSingleton();
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(casSingleton.getInstance());
                }
            }).start();


        }
    }
}
