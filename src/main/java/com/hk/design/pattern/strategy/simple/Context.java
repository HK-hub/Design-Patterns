package com.hk.design.pattern.strategy.simple;

/**
 * @author : HK意境
 * @ClassName : Context
 * @date : 2022/12/12 15:16
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
