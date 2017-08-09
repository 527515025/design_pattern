package com.abel.Mediator;
/**
 * Created by yangyibo on 17/8/3.
 * 具体的中介者
 *
 * 具体处理关系和执行，通过中介者取消了 stock、purchase、sale 多个类之间的耦合关系
 *
 * 定义： 用一个中介对象封装一系列的对象交互，中介者使各个对象不需要显性的相互作用，从而使其耦合松散，而且可以独立的改变他们之间的交互
 *
 * 组成：同事类抽象 、对象 继承同事类抽象 、 定义中介者抽象、实现具体中介者
 *
 * 优点：将原有的一对多的依赖（转移到了中介者的private 方法中实现）变成了一对一依赖，同事类只依赖中介者，减少了依赖，降低了类间的耦合。在实际项目中，中介者是按照职责划分的，每个中介者处理一个或多个类似的关联请求
 *
 * 缺点：中介者类会膨胀的很大，原本N个对象之间的相互依赖，转化为中介者和同事类的依赖，同事类越多，中介者的逻辑就越复杂。
 *
 * 使用场景：类图中出现了，蜘蛛网结构，应该使用 中介者模式，将蜘蛛网结构 梳理成 星型结构,使原本复杂的关系变得清晰
 */
public class Mediator extends AbstractMediator {
    //中介者最重要的方法
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) { //采购电脑
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) { //销售IBM电脑
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) { //打折促销
            this.offSale();
        } else if (str.equals("stock.clear")) { //清库存
            this.clearStock();
        }
    }

    // 采购电脑
    private void buyComputer(int number) {
        //查询销售状况
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80) {
            //销售状况良好
            System.out.println("采购IBM电脑:" + number + "台");
            super.stock.increase(number);
        } else {
            //销售状况不好 折半采购
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑" + buyNumber + "台");
        }
    }

    //销售IBM电脑
    private void sellComputer(int number) {
        //访问库存
        if (super.stock.getStockNumber() < number) {
            //库存数量不够销售，采购电脑
            super.purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑" + number + "台");
        super.stock.decrease(number);
    }

    //打折促销
    private void offSale() {
        //库房有多少卖多少
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

    //清库存，停止采购，打折出售
    private void clearStock() {
        //要求折价销售
        super.sale.offSale();
        //要求采购不要采购
        super.purchase.refuseBuyIBM();
    }
}
