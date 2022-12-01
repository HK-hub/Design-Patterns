package com.hk.design.pattern.factory.simple;

/**
 * @author : HK意境
 * @ClassName : WhiteHuman
 * @date : 2022/11/30 18:54
 * @description : 白人——产品
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class WhiteHuman implements Human{


    @Override
    public void getColor() {
        System.out.println("白色");
    }

    @Override
    public void talk() {
        System.out.println("说英语");
    }
}
