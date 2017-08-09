package com.abel.Mediator;

import com.abel.demo.Purchase;
import com.abel.demo.Sale;
import com.abel.demo.Stock;

/**
 * Created by yangyibo on 17/8/3.
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    //构造函数，创建中介者的时候新建了 三个同事类
    public AbstractMediator() {
        purchase = new Purchase();
        sale = new Sale();
        stock = new Stock();
    }
    //中介者中最重要的方法、事件方法，处理多个对象的关系
    public abstract void execute(String str,Object...objects);
}
