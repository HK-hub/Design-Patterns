package com.hk.design.pattern.factory.simple;

/**
 * @author : HK意境
 * @ClassName : YellowHuman
 * @date : 2022/11/30 18:56
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("说汉语");
    }
}
