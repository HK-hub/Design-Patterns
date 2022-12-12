package com.hk.design.pattern.decorator.simple.report;

/**
 * @author : HK意境
 * @ClassName : SugarFourthGradeSchoolReport
 * @date : 2022/12/12 13:39
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class SugarFourthGradeSchoolReport extends FourthGradeSchoolReport{

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }


    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

}
