package com.abel.Mediator;

/**
 * Created by yangyibo on 17/8/3.
 */
public class Purchase extends AbstractColleague {

    //继承 抽象获取构造函数
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    // 修改 调用抽象中的 中介者，让其执行 方法
    //采购IBM
    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    //不再采购IBM
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM");
    }
}
