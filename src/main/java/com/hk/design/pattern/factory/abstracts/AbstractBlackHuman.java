package com.hk.design.pattern.factory.abstracts;

/**
 * @author : HK意境
 * @ClassName : AbstractBlackHuman
 * @date : 2022/11/30 20:29
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class AbstractBlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑人");
    }

    @Override
    public void talk() {
        System.out.println("非洲语");
    }
}
