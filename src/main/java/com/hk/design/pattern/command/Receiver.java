package com.hk.design.pattern.command;

/**
 * @author : HK意境
 * @ClassName : Receiver
 * @date : 2022/12/11 20:40
 * @description : 接收者：真正干活的对象
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class Receiver {

    // 抽象接收者，定义每个接收者都必须完成的业务
    public abstract void doSomething();

}


/**
 * @ClassName : ConcreteReceiver1
 * @author : HK意境
 * @date : 2022/12/11 20:42
 * @description : 具体接收者，具体干活的对象
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
class ConcreteReceiver1 extends Receiver {

    @Override
    public void doSomething() {

    }
}

class ConcreteReceiver2 extends Receiver {

    @Override
    public void doSomething() {

    }
}
