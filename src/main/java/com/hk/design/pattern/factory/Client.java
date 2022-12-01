package com.hk.design.pattern.factory;

import com.hk.design.pattern.factory.simple.*;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/11/30 18:48
 * @description : 工厂方法模式: define an interface for creating an Object, but lets subclasses decide which class to instantiate.
 *                                  Factory Method let a class defer instantiation to subclasses.
 *                            定义一个接口用于创建某一类对象，但是让子类决定实例化哪一个类。工厂方法模式让类的实例化延迟到其子类
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) throws Exception {

        // 生产人类
        AbstractHumanFactory humanFactory = new HumanFactory();

        // 黄种人
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
        System.out.println(yellowHuman.getClass().getName());


        // 黑人
        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        // 白人
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();


    }


}
