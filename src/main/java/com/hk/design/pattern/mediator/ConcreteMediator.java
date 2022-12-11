package com.hk.design.pattern.mediator;

/**
 * @author : HK意境
 * @ClassName : ConcreteMediator
 * @date : 2022/12/3 21:18
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteMediator extends Mediator{

    @Override
    protected void doSomething1() {
        this.colleague1.selfMethod1();
        this.colleague2.selfMethod2();
    }

    @Override
    protected void doSomething2() {
        this.colleague1.selfMethod2();
        this.colleague2.selfMethod1();
    }
}
