package com.hk.design.pattern.singleton.ic;

/**
 * @author : HK意境
 * @ClassName : InnerClassSingleton
 * @date : 2022/11/30 18:28
 * @description : 静态内部类
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class InnerClassSingleton {


    private InnerClassSingleton() {


    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    static class SingletonHolder {
        public static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

}
