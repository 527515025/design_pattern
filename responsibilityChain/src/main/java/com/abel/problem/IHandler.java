package com.abel.problem;

/**
 * Created by yangyibo on 17/11/7.
 */
public interface IHandler {
    /**
     * 一个女人要求逛街、等请求，需要处理
     * @param women
     */
    public void HandleMessage(IWomen women);
}
