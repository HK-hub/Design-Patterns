package com.hk.design.pattern.strategy;

/**
 * @author : HK意境
 * @ClassName : ConcreteStrategy
 * @date : 2022/12/12 15:26
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteStrategy implements IStrategy{
    @Override
    public void algorithmInterface() {
        System.out.println("策略1");
    }
}
