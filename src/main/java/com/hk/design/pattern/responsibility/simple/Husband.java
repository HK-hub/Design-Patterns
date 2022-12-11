package com.hk.design.pattern.responsibility.simple;

/**
 * @author : HK意境
 * @ClassName : Husband
 * @date : 2022/12/11 22:02
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Husband extends IHandler {
    public Husband() {
        super(IHandler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("妻子的请求：" + women.getRequest());
        System.out.println("丈夫的答复：同意");
    }
}
