package com.hk.design.pattern.decorator.simple.decorator;

import com.hk.design.pattern.decorator.simple.report.SchoolReport;

/**
 * @author : HK意境
 * @ClassName : Decorator
 * @date : 2022/12/12 13:54
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class Decorator extends SchoolReport {

    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
