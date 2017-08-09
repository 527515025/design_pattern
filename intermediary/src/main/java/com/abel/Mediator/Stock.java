package com.abel.Mediator;

import com.abel.demo.*;

/**
 * Created by yangyibo on 17/8/3.
 */
public class Stock extends AbstractColleague {
    public Stock(AbstractMediator _mediator) {
        super(_mediator);
    }

    //刚开始有100台电脑
    private static int COMPUTER_NUMBER = 100;

    //增加库存
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    //库存降低
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    //查询库存数量
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    //修改
    //清库存，停止采购，打折出售
    public void clearStock() {
        System.out.println("清理存货数量" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
