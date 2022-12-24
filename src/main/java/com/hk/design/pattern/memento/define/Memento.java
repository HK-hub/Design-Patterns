package com.hk.design.pattern.memento.define;

/**
 * @author : HK意境
 * @ClassName : Memento
 * @date : 2022/12/24 21:07
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
