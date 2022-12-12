package com.hk.design.pattern.strategy.simple;

/**
 * @author : HK意境
 * @ClassName : BackDoor
 * @date : 2022/12/12 15:12
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class BackDoor extends IStrategy{
    @Override
    public void operate() {
        System.out.println("乔国老开后门");
    }
}
