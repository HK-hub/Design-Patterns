package com.hk.design.pattern.memento;

import com.hk.design.pattern.memento.define.CareTaker;
import com.hk.design.pattern.memento.define.Originator;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/24 20:26
 * @description : 备忘录模式：再不破环封装性的前提下，捕获一个对象的内部状态，并在该对象之保存这个状态。这样以后就可将该对象恢复到原先保存的状态
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        //定义出发起人
        Originator originator = new Originator();
        //定义出备忘录管理员
        CareTaker caretaker = new CareTaker();
        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        //恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());

    }


}


