package com.hk.design.pattern.builder;

import com.hk.design.pattern.builder.AbstractBuilder;
import com.hk.design.pattern.builder.Product;

/**
 * @author : HK意境
 * @ClassName : ConcreteBuilder
 * @date : 2022/12/1 20:46
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteBuilder extends AbstractBuilder {
    @Override
    public AbstractBuilder buildPart() {
        return null;
    }

    @Override
    public Product build() {
        return new Product();
    }
}
