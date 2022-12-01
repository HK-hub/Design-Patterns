package com.hk.design.pattern.factory.simple;

/**
 * @author : HK意境
 * @ClassName : BlackHuman
 * @date : 2022/11/30 18:56
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class BlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑人");
    }

    @Override
    public void talk() {
        System.out.println("说非洲语");
    }
}
