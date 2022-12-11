package com.hk.design.pattern.responsibility.simple;

/**
 * @author : HK意境
 * @ClassName : IWomen
 * @date : 2022/12/11 21:59
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract interface IWomen {
    // 获得个人状况
    public abstract int getType();
    // 获得个人请示，你要干什么？出去逛街？约会?还是看电影？
    public abstract String getRequest();

}
