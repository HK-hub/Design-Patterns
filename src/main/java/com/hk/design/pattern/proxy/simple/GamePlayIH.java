package com.hk.design.pattern.proxy.simple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : HK意境
 * @ClassName : GamePlayIH
 * @date : 2022/12/2 21:03
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class GamePlayIH implements InvocationHandler {

    // 被代理类，目标类
    Class<?> targetClass = null;

    // 被代理的实例
    Object targetObject = null;

    // 我要代理谁
    public GamePlayIH(Object targetObject) {
        this.targetObject = targetObject;
    }


    // 调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(this.targetObject, args);
        return result;
    }
}
