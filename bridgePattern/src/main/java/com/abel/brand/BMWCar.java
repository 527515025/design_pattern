package com.abel.brand;


/**
 * 按品牌分，BMW牌车
 *
 * @author yyb
 * @time 2020/10/25
 */
public class BMWCar extends AbstractCar {


    @Override
    public void run() {
        gear.gear();
        System.out.println("BMW is running");
    }

}
