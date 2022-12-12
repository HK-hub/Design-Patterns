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
public class HighScoreDecorator extends Decorator{
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }

    @Override
    public void sign(String name) {
        super.sign(name);
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

}
