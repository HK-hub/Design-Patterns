package com.hk.design.pattern.adapter.simple.remote;

import java.util.Map;

/**
 * @author : HK意境
 * @ClassName : OuterUser
 * @date : 2022/12/17 20:34
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class OuterUser implements IOuterUser{
    @Override
    public Map getUserBaseInfo() {
        return null;
    }

    @Override
    public Map getUserOfficeInfo() {
        return null;
    }

    @Override
    public Map getUserHomeInfo() {
        return null;
    }
}
