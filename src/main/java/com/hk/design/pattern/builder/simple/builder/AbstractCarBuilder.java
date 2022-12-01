package com.hk.design.pattern.builder.simple.builder;

import com.hk.design.pattern.builder.simple.product.CarModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : HK意境
 * @ClassName : AbstractCarBuilder
 * @date : 2022/12/1 20:16
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class AbstractCarBuilder {

    protected List<String> sequence = new ArrayList<String>();

    public final void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }

    public abstract CarModel getCarModel();

}
