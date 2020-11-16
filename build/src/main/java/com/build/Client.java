package com.build;

import java.util.ArrayList;

import com.build.domain.Director;
import com.build.domain.builder.BMWBuilder;
import com.build.domain.builder.BenzBuilder;
import com.build.domain.model.BmwModel;
import com.build.domain.model.BenzModel;

/**
 * 完整调用连
 *
 * @author yangyibo
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        //生产10个A奔驰车
        for (int i = 0; i < 10; i++) {
            director.getABenzModel().run();
        }
        //生产20个B奔驰车
        for (int i = 0; i < 20; i++) {
            director.getBBenzModel().run();
        }
        //生产30个C宝马车
        for (int i = 0; i < 30; i++) {
            director.getCBMWModel().run();
        }
    }

    /**
     * 不用导演类的编排
     */
    private static void noDirectorClient() {
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();

        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BmwModel bmw = (BmwModel) bmwBuilder.getCarModel();
        bmw.run();
    }
}