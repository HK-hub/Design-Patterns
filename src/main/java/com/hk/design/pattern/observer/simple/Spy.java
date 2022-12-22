package com.hk.design.pattern.observer.simple;

import com.hk.design.pattern.observer.simple.observer.ILiSi;
import com.hk.design.pattern.observer.simple.subject.HanFeiZi;
import com.hk.design.pattern.observer.simple.subject.IHanFei;

/**
 * @author : HK意境
 * @ClassName : Spy
 * @date : 2022/12/21 21:24
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Spy extends Thread{

    private HanFeiZi hanFei;
    private ILiSi liSi;
    private String type;

    public Spy(HanFeiZi hanFei, ILiSi liSi, String type) {
        this.hanFei = hanFei;
        this.liSi = liSi;
        this.type = type;
    }

    @Override
    public void run() {
        while (true) {
            // 监控吃早餐
            if ("breakfast".equalsIgnoreCase(this.type)) {
                // 通知李斯
                this.liSi.update("韩非在吃饭");
                this.hanFei.setHaveBreakfast(true);
            } else {
                this.liSi.update("韩非在娱乐");
                this.hanFei.setHaveFun(true);

            }
        }
    }
}
