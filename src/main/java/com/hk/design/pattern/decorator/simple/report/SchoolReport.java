package com.hk.design.pattern.decorator.simple.report;

/**
 * @author : HK意境
 * @ClassName : SchoolReport
 * @date : 2022/12/12 13:29
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class SchoolReport {

    public abstract void report();

    // 成绩单家长签名
    public abstract void sign(String name);


}
