package com.hk.design.pattern.memento.simple;

/**
 * @author : HK意境
 * @ClassName : CareTaker
 * @date : 2022/12/24 20:53
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class CareTaker {

    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return this.memento;
    }


}
