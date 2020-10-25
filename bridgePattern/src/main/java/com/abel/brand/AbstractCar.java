package com.abel.brand;

import com.abel.transmission.Transmission;

/**
 * 抽象车
 * @author yyb
 * @time 2020/10/25
 */
public abstract class AbstractCar {

    /**
     * 拆分出维度
     */
    protected Transmission gear;

    public abstract void run();

    public void setTransmission(Transmission gear) {
        this.gear = gear;
    }

}
