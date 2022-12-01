package com.hk.design.pattern.factory.abstracts.factory;

import com.hk.design.pattern.factory.abstracts.AbstractHumanFactory;
import com.hk.design.pattern.factory.abstracts.Human;
import com.hk.design.pattern.factory.abstracts.human.*;

/**
 * @author : HK意境
 * @ClassName : MaleHumanFactory
 * @date : 2022/11/30 20:31
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class FemaleHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
