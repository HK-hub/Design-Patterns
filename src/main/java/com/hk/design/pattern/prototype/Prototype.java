package com.hk.design.pattern.prototype;

/**
 * @author : HK意境
 * @ClassName : Prototype
 * @date : 2022/12/3 19:29
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Prototype implements Cloneable{

    // 原型模式
    @Override
    protected Prototype clone() {

        Prototype prototype = null;

        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototype;
    }
}
