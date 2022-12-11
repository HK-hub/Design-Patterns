package com.hk.design.pattern.command.simple.command;

/**
 * @author : HK意境
 * @ClassName : DeletePageCommand
 * @date : 2022/12/11 20:01
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        this.pg.find();
        this.pg.delete();
        this.pg.plan();
    }
}
