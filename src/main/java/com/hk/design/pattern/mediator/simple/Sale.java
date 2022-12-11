package com.hk.design.pattern.mediator.simple;

import java.util.Random;

/**
 * @author : HK意境
 * @ClassName : Sale
 * @date : 2022/12/3 20:08
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Sale extends AbstractColleague{

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellComputer(int number) {

        this.mediator.execete("sale.sell", number);
        System.out.println("销售电脑：" + number + "台");
    }

    public int getSaleStatus() {

        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("电脑销售情况为：" + saleStatus);

        return saleStatus;
    }

    // 打折处理
    public void offSale() {

        // 有多少卖多少
        this.mediator.execete("sale.off");

    }

}
