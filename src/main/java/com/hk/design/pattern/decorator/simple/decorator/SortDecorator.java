package com.hk.design.pattern.decorator.simple.decorator;

import com.hk.design.pattern.decorator.simple.report.SchoolReport;

/**
 * @author : HK意境
 * @ClassName : HighScoreDecorator
 * @date : 2022/12/12 13:56
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class SortDecorator extends Decorator{
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    public void report() {
        this.reportSort();
        super.report();
    }

    @Override
    public void sign(String name) {
        super.sign(name);
    }

    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

}
