package com.hk.design.pattern.command;

/**
 * @author : HK意境
 * @ClassName : Invoker
 * @date : 2022/12/11 21:26
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }


}
