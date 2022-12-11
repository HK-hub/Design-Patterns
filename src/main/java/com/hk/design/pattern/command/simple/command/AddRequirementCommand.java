package com.hk.design.pattern.command.simple.command;

/**
 * @author : HK意境
 * @ClassName : AddRequirementCommand
 * @date : 2022/12/11 20:02
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class AddRequirementCommand extends Command{
    @Override
    public void execute() {
        this.rg.find();
        this.rg.add();
        this.rg.plan();
    }
}
