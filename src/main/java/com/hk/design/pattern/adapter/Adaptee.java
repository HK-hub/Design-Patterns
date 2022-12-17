package com.hk.design.pattern.adapter;

/**
 * @author : HK意境
 * @ClassName : Adaptee
 * @date : 2022/12/17 22:25
 * @description : 适配者(需要被转换的接口)：需要被转换为客户端所期望的接口的类
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public interface Adaptee {

    default void specialRequest() {
        System.out.println("do something");
    }
}

