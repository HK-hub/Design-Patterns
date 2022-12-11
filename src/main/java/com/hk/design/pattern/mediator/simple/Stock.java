package com.hk.design.pattern.mediator.simple;

/**
 * @author : HK意境
 * @ClassName : Stock
 * @date : 2022/12/3 20:09
 * @description : 库存
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Stock extends AbstractColleague{

    // 库存电脑数量
    private static int COMPUTER_COUNT = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void increase(int number) {

        COMPUTER_COUNT += number;
        System.out.println("库存数量：" + COMPUTER_COUNT);

    }

    public void decrease(int number) {
        COMPUTER_COUNT -= number;
        System.out.println("库存数量：" + COMPUTER_COUNT);
    }


    // 库存压力大了，进行清仓处理，停止采购，打折出售
    public void clearStock() {
        this.mediator.execete("stock.clear");

    }

    public int getStockNumber() {
        return Stock.COMPUTER_COUNT;
    }


}
