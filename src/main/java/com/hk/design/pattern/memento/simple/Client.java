package com.hk.design.pattern.memento.simple;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/24 20:33
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        //声明出主角
        Boy boy = new Boy();
        // 声明出备忘录的管理者
        CareTaker careTaker = new CareTaker();
        //初始化当前状态
        boy.setState("心情很棒！");
        System.out.println("=====男孩现在的状态======");
        System.out.println(boy.getState());
        //需要记录下当前状态呀
        careTaker.setMemento(boy.createMemento());
        //男孩去追女孩，状态改变
        boy.changeState();
        System.out.println("\n=====男孩追女孩子后的状态======");
        System.out.println(boy.getState());
        //追女孩失败，恢复原状
        boy.restoreMemento(careTaker.getMemento());
        System.out.println("\n=====男孩恢复后的状态======");
        System.out.println(boy.getState());


    }

}
