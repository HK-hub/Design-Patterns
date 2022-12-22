package com.hk.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : HK意境
 * @ClassName : Subject
 * @date : 2022/12/22 20:14
 * @description : 订阅的主题(被观察者)：观察者观察的主题
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyAll(String context) {
        for (Observer observer : this.observers) {
            observer.update(context);
        }
    }

}
