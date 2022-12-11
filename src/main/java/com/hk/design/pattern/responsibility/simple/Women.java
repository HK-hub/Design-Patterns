package com.hk.design.pattern.responsibility.simple;

import lombok.Data;

/**
 * @author : HK意境
 * @ClassName : Women
 * @date : 2022/12/11 22:00
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Women implements IWomen{


    /**
     *  通过一个int类型的参数来描述妇女的个人状况
     *  * 1--未出嫁
     *  * 2--出嫁
     *  * 3--夫死
     */
    private int type;
    private String request;

    // 通过构造函数传递过来请求


    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
