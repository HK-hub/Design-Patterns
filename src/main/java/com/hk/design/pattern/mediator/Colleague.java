package com.hk.design.pattern.mediator;

/**
 * @author : HK意境
 * @ClassName : Colleague
 * @date : 2022/12/3 21:17
 * @description : 抽象同事者
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}



class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {

    }
    public void selfMethod2() {
        // 处理自己的业务逻辑
        // 自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething1();
    }

}

class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        // 处理自己的业务逻辑
        // 自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething2();
    }
    public void selfMethod2() {

    }
}
