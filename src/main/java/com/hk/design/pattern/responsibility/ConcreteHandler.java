package com.hk.design.pattern.responsibility;

/**
 * @author : HK意境
 * @ClassName : ConcreteHandler
 * @date : 2022/12/11 23:11
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteHandler extends Handler{

    private Handler.Level Level;

    @Override
    protected Level getHandlerLevel() {
        return this.Level;
    }

    @Override
    public Response response(Request request) {
        System.out.println("处理请求");
        // 可选：交给下一个处理器
        this.nextHandler.handleMessage(request);
        return new Response();
    }
}
