package com.hk.design.pattern.factory.abstracts;

/**
 * @author : HK意境
 * @ClassName : AbstractWhiteHuman
 * @date : 2022/11/30 20:28
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人");
    }

    @Override
    public void talk() {
        System.out.println("英语");
    }
}
