package com.abel.example;

/**
 * Created by yangyibo on 17/8/3.
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2(){
        //处理自己逻辑
        //处理自己逻辑
        //处理不了的依赖，交给中介者处理
        super.mediator.doSomething2();
    }
    public void depMethod2(){
        //处理自己逻辑
        //处理自己逻辑
        //处理不了的依赖，交给中介者处理
        super.mediator.doSomething2();
    }
}
