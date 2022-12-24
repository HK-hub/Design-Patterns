package com.hk.design.pattern.memento.define;

/**
 * @author : HK意境
 * @ClassName : CareTaker
 * @date : 2022/12/24 21:09
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class CareTaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
