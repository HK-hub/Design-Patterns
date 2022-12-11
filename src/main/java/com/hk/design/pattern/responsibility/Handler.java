package com.hk.design.pattern.responsibility;

import java.util.Objects;

/**
 * @author : HK意境
 * @ClassName : Handler
 * @date : 2022/12/11 23:01
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class Handler {

    // 下一个处理者
    protected Handler nextHandler;


    //每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();

    public abstract Response response(Request request);


    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }


    public final Response handleMessage(Request request) {
        Response response = null;

        if (request.getLevel() == this.getHandlerLevel()) {
            response = this.response(request);
        } else {
            if (Objects.nonNull(this.nextHandler)) {
                response = this.nextHandler.handleMessage(request);
            } else {
                // 其他业务逻辑: 没有适当处理者

            }
        }

        return response;
    }


    class Response {

    }

    class Level {

    }

}
