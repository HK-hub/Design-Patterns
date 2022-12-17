package com.hk.design.pattern.adapter;

/**
 * @author : HK意境
 * @ClassName : Adapter
 * @date : 2022/12/17 22:25
 * @description : 适配器：将一个类的接口转变成客户端所期望的另一个类的接口
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Adapter extends ConcreteTarget implements Adaptee{

    @Override
    public void request() {
        this.specialRequest();
        super.request();
    }
}
