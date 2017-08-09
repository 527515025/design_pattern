package com.abel.example;

/**
 * Created by yangyibo on 17/8/3.
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }
    public void selfMethod1(){
        //处理自己逻辑
        //处理不了的依赖，交给中介者处理
        super.mediator.doSomething1();
    }
    public void depMethod1(){
        //处理自己逻辑
        //处理不了的依赖，交给中介者处理
        super.mediator.doSomething1();
    }
}
