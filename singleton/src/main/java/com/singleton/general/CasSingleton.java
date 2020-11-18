package com.singleton.general;

import com.singleton.general.bean.Emperor;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS（AtomicReference）实现单例
 * <p>
 * CAS的一个重要缺点在于如果忙等待一直执行不成功(一直在死循环中),会对CPU造成较大的执行开销。
 *
 * @author yyb
 * @time 2020/11/18
 */
public class CasSingleton {
    private static final AtomicReference<Emperor> INSTANCE = new AtomicReference<Emperor>();


    public Emperor getInstance() {
        while (true) {
            Emperor emperor = INSTANCE.get();
            if (emperor != null) {
                return emperor;
            }

            emperor = new Emperor();
            if (INSTANCE.compareAndSet(null, emperor)) {
                return INSTANCE.get();
            }
        }
    }
}
