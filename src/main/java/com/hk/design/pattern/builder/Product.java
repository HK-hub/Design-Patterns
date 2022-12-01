package com.hk.design.pattern.builder;

/**
 * @author : HK意境
 * @ClassName : Product
 * @date : 2022/12/1 20:43
 * @description : 产品类：通常是实现了模板方法模式
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Product {

    public void doSomething() {

    }
    public void doSomething1() {

    }
    public void doSomething2() {

    }

    public final void templateMethod() {
        this.doSomething();
        this.doSomething1();
        this.doSomething2();
    }


}
