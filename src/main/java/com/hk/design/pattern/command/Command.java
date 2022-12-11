package com.hk.design.pattern.command;

/**
 * @author : HK意境
 * @ClassName : Command
 * @date : 2022/12/11 20:44
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class Command {

    public abstract void execute();

}


class ConcreteCommand extends Command {

    // 对那个接收者进行命令处理
    protected Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}

class ConcreteCommand2 extends Command {

    // 对那个接收者进行命令处理
    protected Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}