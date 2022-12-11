package com.hk.design.pattern.mediator.simple;

/**
 * @author : HK意境
 * @ClassName : Purchase
 * @date : 2022/12/3 20:09
 * @description : 采购
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyComputer(int number) {
        this.mediator.execete("purchase.buy", number);
    }

    public void refuseBuyComputer() {
        System.out.println("不在采购电脑");
    }

}
