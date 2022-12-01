package com.hk.design.pattern.singleton.dc;

/**
 * @author : HK意境
 * @ClassName : DoubleCheckSingleton
 * @date : 2022/11/30 18:25
 * @description : 双检查
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton INSTANCE = null;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {

        if (INSTANCE == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingleton();
                    return INSTANCE;
                }
            }
        }

        return INSTANCE;
    }


}
