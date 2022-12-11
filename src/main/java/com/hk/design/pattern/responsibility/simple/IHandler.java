package com.hk.design.pattern.responsibility.simple;

import lombok.Setter;

import java.util.Objects;

/**
 * @author : HK意境
 * @ClassName : IHandler
 * @date : 2022/12/11 22:00
 * @description : 控制权的抽象
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Setter
public abstract class IHandler {

    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    //能处理的级别
    private int level = 0;
    //责任传递，下一个人责任人是谁
    private IHandler nextHandler;

    public IHandler(int level) {
        this.level = level;
    }

    // 一个女性（女儿、妻子或者母亲）要求逛街，你要处理这个请求
    public void handleMessage(IWomen women) {

        if (women.getType() == this.level) {
            // 该我处理
            this.response(women);
        } else {
            // 传递给后续环节
            if (Objects.nonNull(this.nextHandler)) {
                this.nextHandler.handleMessage(women);
            } else {
                // 没有后续处理的人了，按不同意处理
                System.out.println("没地方请示了，不同意");
            }
        }

    }

    protected abstract void response(IWomen women);

}
