package com.abel.Mediator;

/**
 * Created by yangyibo on 17/8/3.
 * 创建一个中介者，然后分别传递到三个同事类，三个同事类都只负责自己的活动，与自己无关的活动就丢给中介者。
 */
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        //采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        //销售人员销售电脑
        System.out.println("------销售人员销售电脑--------");
        Sale sale = new Sale(mediator);
        //卖了1台
        sale.sellIBMComputer(1);
        //库房管理人员管理库房
        System.out.println("------库房管理人员管理库房------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
