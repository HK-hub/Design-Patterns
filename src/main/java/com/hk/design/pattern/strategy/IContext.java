package com.hk.design.pattern.strategy;

import com.hk.design.pattern.strategy.simple.IStrategy;

/**
 * @author : HK意境
 * @ClassName : IContext
 * @date : 2022/12/12 15:25
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class IContext {

    private IStrategy strategy;

    public IContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        this.strategy.operate();
    }

}
