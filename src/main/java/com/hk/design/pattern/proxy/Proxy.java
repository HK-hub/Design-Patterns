package com.hk.design.pattern.proxy;

/**
 * @author : HK意境
 * @ClassName : Proxy
 * @date : 2022/12/2 20:23
 * @description : 代理模式：代理类
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    // 预处理
    public void preHandle() {
        System.out.println("代理类预处理");
    }

    @Override
    public void request() {
        this.preHandle();
        // 调用被代理类方法：目标方法
        this.subject.request();
        this.postHandle();
    }

    // 善后处理
    public void postHandle() {
        System.out.println("代理类后置处理");
    }

}
