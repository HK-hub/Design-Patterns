package com.hk.design.pattern.template;

/**
 * @author : HK意境
 * @ClassName : AbstractTemplateClass
 * @date : 2022/12/1 18:34
 * @description : 抽象模板类
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class AbstractTemplateClass {

    // 基本方法
    protected abstract void baseOperation1();

    protected abstract void baseOperation2();

    protected abstract void baseOperation3();


    // 模板方法
    public final void templateMethod() {
        this.baseOperation1();
        this.baseOperation2();
        this.baseOperation3();
    }

}
