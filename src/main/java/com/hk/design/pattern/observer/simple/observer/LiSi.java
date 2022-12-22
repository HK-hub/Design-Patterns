package com.hk.design.pattern.observer.simple.observer;

/**
 * @author : HK意境
 * @ClassName : LiSi
 * @date : 2022/12/21 21:19
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class LiSi implements ILiSi {

    // 李斯是个观察者，一旦韩非子有活动，他就知道
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(context);
        System.out.println("李斯：汇报完毕...\n");
    }


    //汇报给秦始皇
    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
    }

}
