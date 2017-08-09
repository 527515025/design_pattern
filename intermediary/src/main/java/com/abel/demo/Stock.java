package com.abel.demo;

/**
 * Created by yangyibo on 17/7/21.
 * 存货管理
 */
public class Stock {
    //刚开始有100台电脑
    private static int COMPUTER_NUMBER = 100; //

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

    //如果库存量大了就要停止采购，通知销售人员，清库存，打折出售
    public void clearStock() {
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理存货数量" + COMPUTER_NUMBER);
        //要求折价销售
        sale.offSale();
        //要求采购不要采购
        purchase.refuseBuyIBM();
    }
}