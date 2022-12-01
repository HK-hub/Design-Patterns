package com.hk.design.pattern.factory.abstracts.human;

import com.hk.design.pattern.factory.abstracts.AbstractWhiteHuman;

/**
 * @author : HK意境
 * @ClassName : MaleYellowHuman
 * @date : 2022/11/30 20:33
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void gender() {
        System.out.println("女人");
    }
}
