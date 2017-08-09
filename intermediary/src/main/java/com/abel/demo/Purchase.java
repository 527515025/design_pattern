package com.abel.demo;

/**
 * Created by yangyibo on 17/7/21.
 * 采购管理
 */
public class Purchase {
    //  采购IBM电脑
    public void buyIBMcomputer(int number) {
        //访问库存
        Stock stock = new Stock();
        //访问销售
        Sale sale = new Sale();
        //查询销售状况
        int saleStatus = sale.getSaleStatus();
        //如果销售量大于80则表示销售良好，让采购多少台电脑就采购多少台电脑，如果销售不好，则对半采购。
        if (saleStatus > 80) {
            //销售状况良好
            System.out.println("采购IBM电脑:" + number + " ");
            stock.increase(number);
        } else {
            //销售状况不好 折半采购
            int buyNumber = number/2;
            System.out.println("采购IBM电脑" + buyNumber + " ");
        }
    }

    //不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }

}
