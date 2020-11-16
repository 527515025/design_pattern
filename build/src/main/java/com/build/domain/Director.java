package com.build.domain;

import com.build.domain.builder.BMWBuilder;
import com.build.domain.builder.BenzBuilder;
import com.build.domain.model.BenzModel;
import com.build.domain.model.BmwModel;

import java.util.ArrayList;

/**
 * 导演类，编排各种汽车型号的 运行顺序方法
 *
 * @author yyb
 * @time 2020/11/16
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     * A类型的奔驰车模型
     */
    public BenzModel getABenzModel() {
        //清理场景
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * B类型的奔驰车模型
     */
    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * A类型的宝马车模型
     */
    public BmwModel getCBMWModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BmwModel) this.bmwBuilder.getCarModel();
    }

    /**
     * B类型的宝马车模型
     */
    public BmwModel getDBMWModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BmwModel) this.benzBuilder.getCarModel();
    }
}
