package com.hk.design.pattern.factory.method;

/**
 * @author : HK意境
 * @ClassName : Creator
 * @date : 2022/11/30 19:17
 * @description : 工厂方法模式之抽象工厂
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class Creator {

    // 定义一个接口用于创建一类对象
    public abstract <T extends Product> T createProduct(Class<T> clazz);


}
