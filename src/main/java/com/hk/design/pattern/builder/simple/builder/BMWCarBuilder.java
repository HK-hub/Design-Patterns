package com.hk.design.pattern.builder.simple.builder;

import com.hk.design.pattern.builder.simple.product.BMWzCarModel;
import com.hk.design.pattern.builder.simple.product.BenzCarModel;
import com.hk.design.pattern.builder.simple.product.CarModel;

/**
 * @author : HK意境
 * @ClassName : BenzCarBuilder
 * @date : 2022/12/1 20:17
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class BMWCarBuilder extends AbstractCarBuilder {

    @Override
    public CarModel getCarModel() {
        CarModel bmWzCarModel = new BMWzCarModel();
        bmWzCarModel.setSequence(this.sequence);
        return bmWzCarModel;
    }
}
