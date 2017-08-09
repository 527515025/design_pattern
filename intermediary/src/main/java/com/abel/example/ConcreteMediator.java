package com.abel.example;

/**
 * Created by yangyibo on 17/8/3.
 */
public class ConcreteMediator extends Mediator {

    public void doSomething1() {
        // 调用同事类的方法，
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    public void doSomething2() {
        super.c1.depMethod1();
        super.c2.depMethod2();
    }
}
