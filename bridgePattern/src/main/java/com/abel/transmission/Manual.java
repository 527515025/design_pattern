package com.abel.transmission;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 手动档
 * @author yyb
 * @time 2020/10/25
 */
public class Manual extends Transmission {

    private static final Logger LOG = LoggerFactory.getLogger(Manual.class);

    @Override
    public void gear() {
        LOG.info("Manual transmission");
    }
}
