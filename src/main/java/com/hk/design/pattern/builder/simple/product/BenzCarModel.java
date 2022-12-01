package com.hk.design.pattern.builder.simple.product;

/**
 * @author : HK意境
 * @ClassName : BenzCarModel
 * @date : 2022/12/1 19:57
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class BenzCarModel extends CarModel{
    @Override
    protected void start() {
        System.out.println(this.getClass().getSimpleName() + ": 启动了");
    }

    @Override
    protected void stop() {
        System.out.println(this.getClass().getSimpleName() + ": 停止了");

    }

    @Override
    protected void alarm() {
        System.out.println(this.getClass().getSimpleName() + ": 鸣笛了");

    }

    @Override
    protected void engineBoom() {
        System.out.println(this.getClass().getSimpleName() + ": 发动引擎了");

    }
}
