package com.hk.design.pattern.proxy;

/**
 * @author : HK意境
 * @ClassName : RealSubject
 * @date : 2022/12/2 20:21
 * @description : 代理模式：具体主题———— 被代理类，也叫目标类
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("被代理类，真实主题执行方法");
    }
}
