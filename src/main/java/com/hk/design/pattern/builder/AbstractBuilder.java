package com.hk.design.pattern.builder;

/**
 * @author : HK意境
 * @ClassName : AbstractBuilder
 * @date : 2022/12/1 20:44
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class AbstractBuilder {



    public abstract AbstractBuilder buildPart();

    public abstract Product build();

}
