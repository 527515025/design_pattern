package com.abel.Mediator;

/**
 * Created by yangyibo on 17/8/3.
 * 同事类
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    //传递进来中介者
    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;

    }
}
