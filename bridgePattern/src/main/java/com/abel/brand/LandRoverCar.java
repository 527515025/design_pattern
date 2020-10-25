package com.abel.brand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yyb
 * @time 2020/10/25
 */
public class LandRoverCar extends AbstractCar {

    private static final Logger LOG = LoggerFactory.getLogger(LandRoverCar.class);

    @Override
    public void run() {
        gear.gear();
        System.out.println("LandRoverCar is running");
    }

}
