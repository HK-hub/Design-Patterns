package com.hk.design.pattern.command.simple.invoke;

import com.hk.design.pattern.command.simple.command.Command;

/**
 * @author : HK意境
 * @ClassName : Invoker
 * @date : 2022/12/11 20:02
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
