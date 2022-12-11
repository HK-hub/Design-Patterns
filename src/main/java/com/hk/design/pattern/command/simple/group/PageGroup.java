package com.hk.design.pattern.command.simple.group;

/**
 * @author : HK意境
 * @ClassName : PageGroup
 * @date : 2022/12/11 17:52
 * @description : 美工组
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class PageGroup extends Group{
    @Override
    public void find() {
        System.out.println("客户找到美工组");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一个页面");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个页面");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一个页面");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划");
    }
}
