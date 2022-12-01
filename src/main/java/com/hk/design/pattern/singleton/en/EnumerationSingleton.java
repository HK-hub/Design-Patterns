package com.hk.design.pattern.singleton.en;

/**
 * @author : HK意境
 * @ClassName : EnumerationSingleton
 * @date : 2022/11/30 18:32
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public enum EnumerationSingleton {

    INSTANCE,
    ;

    private EnumerationSingleton() {

    }
    public static EnumerationSingleton getInstance() {
        return INSTANCE;
    }

}
