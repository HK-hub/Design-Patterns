package com.hk.design.pattern.mediator;

/**
 * @author : HK意境
 * @ClassName : Mediator
 * @date : 2022/12/3 21:17
 * @description : 抽象中介者
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class Mediator {

    protected ConcreteColleague1 colleague1;

    protected ConcreteColleague2 colleague2;

    // 中介者模式的业务逻辑
    protected abstract void doSomething1();

    protected abstract void doSomething2();


    public ConcreteColleague1 getColleague1() {
        return colleague1;
    }

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public ConcreteColleague2 getColleague2() {
        return colleague2;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }
}
