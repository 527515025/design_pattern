package com.abel.brand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 奔驰车
 * @author yyb
 * @time 2020/10/25
 */
public class BenZCar extends AbstractCar{

    private static final Logger LOG = LoggerFactory.getLogger(BenZCar.class);

    @Override
    public void run() {
        gear.gear();
        LOG.info("BenZCar is running");
    }
}
