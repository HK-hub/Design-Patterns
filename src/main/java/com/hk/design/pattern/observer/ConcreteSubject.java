package com.hk.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : HK意境
 * @ClassName : ConcreteSubject
 * @date : 2022/12/22 20:17
 * @description : 具体主题(具体被观察者)
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteSubject extends Subject{

    public void doSomething() {
        this.notifyAll("context1");
    }


}
