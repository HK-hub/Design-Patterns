package com.hk.design.principle.dip;

/**
 * @author : HK意境
 * @ClassName : Driver
 * @date : 2022/11/26 21:49
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Driver implements IDriver{
    // 司机的主要职责就是驾驶汽车
    @Override
    public void drive(ICar car) {

        car.run();

    }

}
