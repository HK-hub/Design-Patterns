package com.hk.design.pattern.responsibility.simple;

/**
 * @author : HK意境
 * @ClassName : Father
 * @date : 2022/12/11 22:01
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Father extends IHandler {
    public Father() {
        super(IHandler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("女儿的请求：" + women.getRequest());
        System.out.println("父亲的答复：同意");
    }
}
