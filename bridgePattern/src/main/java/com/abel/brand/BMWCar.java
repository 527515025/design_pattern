package com.abel.brand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 按品牌分，BMW牌车
 *
 * @author yyb
 * @time 2020/10/25
 */
public class BMWCar extends AbstractCar {

    private static final Logger LOG = LoggerFactory.getLogger(BMWCar.class);

    @Override
    public void run() {
        gear.gear();
        LOG.info("BMW is running");
    }

}
