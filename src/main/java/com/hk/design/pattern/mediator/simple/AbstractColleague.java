package com.hk.design.pattern.mediator.simple;

/**
 * @author : HK意境
 * @ClassName : AbstractColleague
 * @date : 2022/12/3 20:40
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
