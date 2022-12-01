package com.hk.design.pattern.factory.abstracts;

import com.hk.design.pattern.factory.abstracts.factory.FemaleHumanFactory;
import com.hk.design.pattern.factory.abstracts.factory.MaleHumanFactory;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/11/30 20:40
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        // 第一条生产线：男性生产线
        AbstractHumanFactory humanFactory = new MaleHumanFactory();
        Human blackHuman = humanFactory.createBlackHuman();
        blackHuman.gender();
        blackHuman.getColor();

        Human yellowHuman = humanFactory.createYellowHuman();
        yellowHuman.getColor();
        yellowHuman.gender();

        // 第二条生产线
        AbstractHumanFactory humanFactory1 = new FemaleHumanFactory();
        Human whiteHuman = humanFactory1.createWhiteHuman();
        whiteHuman.getColor();
        whiteHuman.gender();


    }


}
