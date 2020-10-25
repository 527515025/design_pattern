package com.abel.brand;

/**
 * @author yyb
 * @time 2020/10/25
 */
public class LandRoverCar extends AbstractCar {


    @Override
    public void run() {
        gear.gear();
        System.out.println("LandRoverCar is running");
    }

}
