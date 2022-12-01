package com.hk.design.pattern.factory.simple;

import java.lang.reflect.InvocationTargetException;

/**
 * @author : HK意境
 * @ClassName : AbstractHumanFactory
 * @date : 2022/11/30 18:52
 * @description : 抽象工厂
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;


}
