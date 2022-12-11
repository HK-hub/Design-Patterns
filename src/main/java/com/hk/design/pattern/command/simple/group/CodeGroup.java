package com.hk.design.pattern.command.simple.group;

/**
 * @author : HK意境
 * @ClassName : CodeGroup
 * @date : 2022/12/11 17:52
 * @description : 代码组
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class CodeGroup extends Group{
    @Override
    public void find() {
        System.out.println("找到代码组");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一个功能");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个功能");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一个页面");
    }

    @Override
    public void plan() {
        System.out.println("客户要求功能变更计划");
    }
}
