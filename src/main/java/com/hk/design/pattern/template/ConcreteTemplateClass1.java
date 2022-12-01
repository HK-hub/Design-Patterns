package com.hk.design.pattern.template;

/**
 * @author : HK意境
 * @ClassName : ConcreteTemplateClass1
 * @date : 2022/12/1 18:37
 * @description : 具体模板: 实现基本方法
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteTemplateClass1 extends AbstractTemplateClass{
    @Override
    protected void baseOperation1() {
        System.out.println("具体模板1");
    }

    @Override
    protected void baseOperation2() {
        System.out.println("具体模板1");

    }

    @Override
    protected void baseOperation3() {
        System.out.println("具体模板1");

    }
}
