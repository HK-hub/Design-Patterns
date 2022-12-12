package com.hk.design.pattern.decorator.simple;

import com.hk.design.pattern.decorator.simple.decorator.HighScoreDecorator;
import com.hk.design.pattern.decorator.simple.decorator.SortDecorator;
import com.hk.design.pattern.decorator.simple.report.FourthGradeSchoolReport;
import com.hk.design.pattern.decorator.simple.report.SchoolReport;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/12 13:28
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        SchoolReport schoolReport = new FourthGradeSchoolReport();

        schoolReport = new HighScoreDecorator(schoolReport);
        schoolReport.report();
        schoolReport.sign("老三");

        System.out.println("----------------------------------");
        schoolReport = new SortDecorator(schoolReport);
        schoolReport.report();
        schoolReport.sign("老三");
    }

}
