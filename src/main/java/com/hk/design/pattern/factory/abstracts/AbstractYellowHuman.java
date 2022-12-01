package com.hk.design.pattern.factory.abstracts;

/**
 * @author : HK意境
 * @ClassName : AbstractYellowHuman
 * @date : 2022/11/30 20:27
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class AbstractYellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("中国话");
    }
}
