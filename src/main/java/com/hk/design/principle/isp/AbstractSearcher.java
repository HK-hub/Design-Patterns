package com.hk.design.principle.isp;

import lombok.Data;

/**
 * @author : HK意境
 * @ClassName : AbstractSearcher
 * @date : 2022/11/27 14:03
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Data
public abstract class AbstractSearcher {

    protected IGoodBodyGirl goodBodyGirl;
    protected IGreatTemperamentGirl greatTemperamentGirl;

    public AbstractSearcher(IGoodBodyGirl goodBodyGirl) {
        this.goodBodyGirl = goodBodyGirl;
    }

    public AbstractSearcher(IGreatTemperamentGirl greatTemperamentGirl) {
        this.greatTemperamentGirl = greatTemperamentGirl;
    }

    public abstract void show();

}
