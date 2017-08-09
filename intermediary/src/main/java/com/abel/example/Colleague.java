package com.abel.example;

/**
 * Created by yangyibo on 17/8/3.
 */
public abstract class Colleague {
    public Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
