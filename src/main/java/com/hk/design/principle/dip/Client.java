package com.hk.design.principle.dip;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/11/26 21:49
 * @description : 依赖倒置原则
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        IDriver driver = new Driver();

        ICar benz = new Benz();
        driver.drive(benz);
        ICar bmw = new BMW();
        driver.drive(bmw);


    }

}
