package com.hk.design.pattern.factory.abstracts.factory;

import com.hk.design.pattern.factory.abstracts.AbstractHumanFactory;
import com.hk.design.pattern.factory.abstracts.Human;
import com.hk.design.pattern.factory.abstracts.human.MaleBlackHuman;
import com.hk.design.pattern.factory.abstracts.human.MaleWhiteHuman;
import com.hk.design.pattern.factory.abstracts.human.MaleYellowHuman;

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
public class MaleHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
