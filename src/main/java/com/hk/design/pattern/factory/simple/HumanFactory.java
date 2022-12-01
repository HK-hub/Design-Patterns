package com.hk.design.pattern.factory.simple;

import java.lang.reflect.InvocationTargetException;

/**
 * @author : HK意境
 * @ClassName : HumanFactory
 * @date : 2022/11/30 18:57
 * @description : 具体工厂
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class HumanFactory extends AbstractHumanFactory{

    @Override
    public <T extends Human> T createHuman(Class<T> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // 生产human 对象
        T human = clazz.getDeclaredConstructor().newInstance();

        return human;
    }
}
