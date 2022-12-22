package com.hk.design.pattern.observer.simple;

import com.hk.design.pattern.observer.simple.observer.LiSi;
import com.hk.design.pattern.observer.simple.subject.HanFeiZi;

import java.util.concurrent.TimeUnit;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/21 21:04
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        HanFeiZi hanFeiZi = new HanFeiZi();

        hanFeiZi.haveBreakfast();
        TimeUnit.SECONDS.sleep(1);
        hanFeiZi.haveFun();


    }


}
