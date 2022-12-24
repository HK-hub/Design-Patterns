package com.hk.design.pattern.memento.simple;

/**
 * @author : HK意境
 * @ClassName : Boy
 * @date : 2022/12/24 20:33
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Boy {

    private String state;

    public void changeState() {
        this.state = "心情很不好";
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

}
