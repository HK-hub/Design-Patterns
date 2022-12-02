package com.hk.design.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author : HK意境
 * @ClassName : SubjectDynamicProxy
 * @date : 2022/12/2 21:42
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class SubjectDynamicProxy {

    public static Subject newSubjectProxyInstance(Subject subject) {

        Subject instance = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), new MyInvocationHandler(subject));

        return subject;
    }


}
