package com.hk.design.pattern.mediator.simple;

/**
 * @author : HK意境
 * @ClassName : AbstractMediator
 * @date : 2022/12/3 20:35
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class AbstractMediator {

    protected Sale sale;

    protected Purchase purchase;

    protected Stock stock;

    public AbstractMediator() {
        this.sale = new Sale(this);
        this.purchase = new Purchase(this);
        this.stock = new Stock(this);
    }


    public abstract void execete(String str, Object... args);

}
