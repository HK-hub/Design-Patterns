package com.hk.design.pattern.memento.define;

/**
 * @author : HK意境
 * @ClassName : Originator
 * @date : 2022/12/24 21:05
 * @description : 发起人角色：负责记录当前时刻的状态，负责定义那些属于当前备份范围的状态，负责创建和恢复状态
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }


}
