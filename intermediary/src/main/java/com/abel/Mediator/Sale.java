package com.abel.Mediator;

import com.abel.demo.*;
import com.abel.demo.Purchase;
import com.abel.demo.Stock;

import java.util.Random;

/**
 * Created by yangyibo on 17/8/3.
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator _mediator) {
        super(_mediator);
    }

    //销售IBM电脑
    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑"+ number + "台");
    }

    //反馈销售状态， 0-100 之间变化，100 畅销 0 没人买
    public int getSaleStatus() {
        //定义随机数作为当前的销售状态
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑销售状况为" + saleStatus);
        return saleStatus;
    }

    //折价处理
    public void offSale() {
        super.mediator.execute("sale.offsell");
    }
}
