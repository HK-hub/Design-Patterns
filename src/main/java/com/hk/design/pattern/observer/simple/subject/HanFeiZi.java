package com.hk.design.pattern.observer.simple.subject;

import com.hk.design.pattern.observer.simple.observer.LiSi;
import com.hk.design.pattern.observer.simple.observer.Observer;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : HK意境
 * @ClassName : HanFeiZi
 * @date : 2022/12/21 21:07
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Data
public class HanFeiZi implements IHanFei, Observable{

    // 观察者
    private List<Observer> observers = new ArrayList<Observer>();
    // private LiSi liSi = new LiSi();
    private boolean isHaveBreakfast;
    private boolean haveFun;


    @Override
    public void haveBreakfast() {
        this.notifyObservers("breakfast");
    }

    @Override
    public void haveFun() {
        this.notifyObservers("haveFun");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : this.observers) {
            observer.update(context);
        }
    }
}
