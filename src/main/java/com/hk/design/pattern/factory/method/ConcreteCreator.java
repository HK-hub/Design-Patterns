package com.hk.design.pattern.factory.method;

/**
 * @author : HK意境
 * @ClassName : ConcreteCreator
 * @date : 2022/11/30 19:19
 * @description : 工厂模式：具体工厂
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        return null;
    }
}
