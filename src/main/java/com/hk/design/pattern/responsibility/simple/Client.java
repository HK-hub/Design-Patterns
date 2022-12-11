package com.hk.design.pattern.responsibility.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/11 21:58
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        //随机挑选几个女性
        Random rand = new Random();
        List<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        //定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        son.setNextHandler(null);
        for (IWomen women : arrayList) {
            father.handleMessage(women);
        }

    }


}
