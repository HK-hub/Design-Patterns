package com.hk.design.pattern.adapter.simple.remote;

import java.util.Map;

/**
 * @author : HK意境
 * @ClassName : IOuterUser
 * @date : 2022/12/17 20:33
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public interface IOuterUser {

    public Map getUserBaseInfo();
    public Map getUserOfficeInfo();
    public Map getUserHomeInfo();

}
