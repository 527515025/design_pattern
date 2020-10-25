package com.abel.transmission;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自动档
 * @author yyb
 * @time 2020/10/25
 */
public class Auto extends Transmission {

    private static final Logger LOG = LoggerFactory.getLogger(Auto.class);

    @Override
    public void gear() {
        LOG.info("Auto transmission");
    }
}
