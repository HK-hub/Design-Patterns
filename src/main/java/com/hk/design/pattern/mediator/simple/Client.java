package com.hk.design.pattern.mediator.simple;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/3 20:06
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        AbstractMediator mediator = new Mediator();
        // 采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyComputer(100);
        // 销售人员销售电脑
        System.out.println("\n------销售人员销售电脑--------");
        Sale sale = new Sale(mediator);
        sale.sellComputer(1);
        // 库房管理人员管理库存
        System.out.println("\n------库房管理人员清库处理--------");
        Stock stock = new Stock(mediator);
        stock.clearStock();

    }

}
