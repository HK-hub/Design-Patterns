package com.hk.design.pattern.observer.simple.subject;

import com.hk.design.pattern.observer.simple.observer.Observer;

/**
 * @author : HK意境
 * @ClassName : Observable
 * @date : 2022/12/22 19:58
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public interface Observable {

    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers(String context);


}
