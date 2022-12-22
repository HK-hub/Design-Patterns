package com.hk.design.pattern.observer;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/21 21:04
 * @description : 观察者模式：Define a one-to-many dependency between objects so that when one object changes state,
 *                              all its dependents are notified and updated automatically
 *                          定义对象间的一种一对多的依赖关系，使得每当一个对象的状态改变时，则所依赖于它的对象都会得到通知并被自动更新。
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {


    public static void main(String[] args) {

        Observer concreteObserver = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(concreteObserver);

        subject.doSomething();

    }



}
