package com.hk.design.pattern.strategy.simple;

/**
 * @author : HK意境
 * @ClassName : BlockEnemy
 * @date : 2022/12/12 15:14
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class BlockEnemy extends IStrategy{
    @Override
    public void operate() {
        System.out.println("孙夫人断后");
    }
}
