package com.hk.design.pattern.builder;

/**
 * @author : HK意境
 * @ClassName : Director
 * @date : 2022/12/1 20:49
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Director {

    private AbstractBuilder builder = new ConcreteBuilder();

    //构建不同的产品
    public Product getAProduct() {
        builder.buildPart(); /* * 设置不同的零件，产生不同的产品 */
        return builder.build();
    }



}
