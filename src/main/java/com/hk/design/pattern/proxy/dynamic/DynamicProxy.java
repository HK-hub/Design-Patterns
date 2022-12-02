package com.hk.design.pattern.proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author : HK意境
 * @ClassName : DynamicProxy
 * @date : 2022/12/2 21:38
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(Class<T> clazz, Class<?>[] interfaces, InvocationHandler handler) {

        T instance = (T) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), handler);

        return instance;
    }


}
