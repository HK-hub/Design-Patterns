package com.hk.design.pattern.decorator.simple.report;

/**
 * @author : HK意境
 * @ClassName : FourthGradeSchoolReport
 * @date : 2022/12/12 13:30
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class FourthGradeSchoolReport extends SchoolReport {


    @Override
    public void report() {
        //成绩单的格式是这个样子的
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println("            家长签名：           ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为："+name);
    }
}
