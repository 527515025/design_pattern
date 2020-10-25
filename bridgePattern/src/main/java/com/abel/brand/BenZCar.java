package com.abel.brand;


/**
 * 奔驰车
 * @author yyb
 * @time 2020/10/25
 */
public class BenZCar extends AbstractCar{


    @Override
    public void run() {
        gear.gear();
        System.out.println("BenZCar is running");
    }
}
