package com.hk.design.pattern.prototype.simple;

/**
 * @author : HK意境
 * @ClassName : AdvTemplate
 * @date : 2022/12/3 19:00
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class AdvTemplate {

    // 广告信名称
    private String advSubject ="XX银行国庆信用卡抽奖活动";
    // 广告信内容
    private String advContext = "国庆抽奖活动通知：只要刷卡就送你一百万！...";



    public String getAdvSubject() {
        return advSubject;
    }

    public void setAdvSubject(String advSubject) {
        this.advSubject = advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }

    public void setAdvContext(String advContext) {
        this.advContext = advContext;
    }
}
