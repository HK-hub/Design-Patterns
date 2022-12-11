package com.hk.design.pattern.command.simple;

import com.hk.design.pattern.command.simple.command.AddRequirementCommand;
import com.hk.design.pattern.command.simple.command.DeletePageCommand;
import com.hk.design.pattern.command.simple.group.Group;
import com.hk.design.pattern.command.simple.group.PageGroup;
import com.hk.design.pattern.command.simple.group.RequirementGroup;
import com.hk.design.pattern.command.simple.invoke.Invoker;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/11 17:48
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        // 客户首先找到需求组，过来谈需求
        System.out.println("------------------客户要求增加一项需求------------------------");
        Group rg = new RequirementGroup();
        // 找到需求组
        rg.find();
        // 增加一个新要求
        rg.add();
        // 要需求变更计划
        rg.plan();

        //首先客户找到美工组说，过来谈页面，并修改
        System.out.println("----------客户要求删除一个页面--------------");
        Group pg = new PageGroup();
        //找到需求组
        pg.find();
        //删除一项需求
        pg.delete();
        //要求变更计划
        pg.plan();

        System.out.println("----------使用命令模式--------------");

        // 使用命令模式
        Invoker invoker = new Invoker();
        // 新增需求
        invoker.setCommand(new AddRequirementCommand());
        invoker.action();

        // 删除页面
        invoker.setCommand(new DeletePageCommand());
        invoker.action();
    }

}
