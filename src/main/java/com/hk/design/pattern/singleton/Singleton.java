package com.hk.design.pattern.singleton;

/**
 * @author : HK意境
 * @ClassName : Singleton
 * @date : 2022/11/30 18:00
 * @description : 单例设计模式：一般形式
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Singleton {

    // 饿汉式，线程安全的，在类加载中的初始化阶段赋值
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return INSTANCE;
    }



}
