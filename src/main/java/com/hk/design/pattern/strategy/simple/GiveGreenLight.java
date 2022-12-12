package com.hk.design.pattern.strategy.simple;

/**
 * @author : HK意境
 * @ClassName : GiveGreenLight
 * @date : 2022/12/12 15:13
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class GiveGreenLight extends IStrategy {

    @Override
    public void operate() {
        System.out.println("吴国太开绿灯");
    }
}
