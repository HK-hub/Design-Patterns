package com.hk.design.pattern.responsibility.simple;

/**
 * @author : HK意境
 * @ClassName : Son
 * @date : 2022/12/11 22:05
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Son extends IHandler {
    public Son() {
        super(IHandler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("母亲的请求：" + women.getRequest());
        System.out.println("儿子的答复：同意");
    }
}
