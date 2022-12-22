package com.hk.design.pattern.observer;

/**
 * @author : HK意境
 * @ClassName : ConcreteObserver
 * @date : 2022/12/22 20:16
 * @description : 具体观察者
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteObserver implements Observer{
    @Override
    public void update(String context) {
        //
        System.out.println("收到通知：" + context);

    }
}
