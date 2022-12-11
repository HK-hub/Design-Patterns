package com.hk.design.pattern.command.simple.command;

/**
 * @author : HK意境
 * @ClassName : AddFunCommand
 * @date : 2022/12/11 20:09
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class AddFunCommand extends Command{
    @Override
    public void execute() {
        this.cg.find();
        this.cg.add();
        this.cg.plan();
    }
}
