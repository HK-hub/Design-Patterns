package com.hk.design.pattern.factory.abstracts;

/**
 * @author : HK意境
 * @ClassName : AbstractHumanFactory
 * @date : 2022/11/30 20:26
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class AbstractHumanFactory {

    public abstract Human createYellowHuman();
    public abstract Human createBlackHuman();
    public abstract Human createWhiteHuman();

}
