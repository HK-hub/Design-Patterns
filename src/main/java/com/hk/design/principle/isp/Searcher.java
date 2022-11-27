package com.hk.design.principle.isp;

import java.util.Objects;

/**
 * @author : HK意境
 * @ClassName : Searcher
 * @date : 2022/11/27 14:09
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Searcher extends AbstractSearcher{

    public Searcher(IGoodBodyGirl goodBodyGirl) {
        super(goodBodyGirl);
    }

    public Searcher(IGreatTemperamentGirl greatTemperamentGirl) {
        super(greatTemperamentGirl);
    }

    @Override
    public void show() {
        if (Objects.nonNull(this.goodBodyGirl)) {
            this.goodBodyGirl.goodLooking();
            this.goodBodyGirl.niceFigure();
        }
        if (Objects.nonNull(this.greatTemperamentGirl)) {
            this.greatTemperamentGirl.greatTemperament();
        }
    }
}
