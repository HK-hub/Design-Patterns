package com.hk.design.pattern.facade;

import com.hk.design.pattern.facade.subsystem.SubClassA;
import com.hk.design.pattern.facade.subsystem.SubClassB;
import com.hk.design.pattern.facade.subsystem.SubClassC;

/**
 * @author : HK意境
 * @ClassName : Facade
 * @date : 2022/12/23 19:40
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Facade {

    // 被委托的对象
    private SubClassA subClassA = new SubClassA();
    private SubClassB subClassB = new SubClassB();
    private SubClassC subClassC = new SubClassC();


    // 提供给外部的访问方法
    public void methodA() {
        this.subClassA.doSomethingA();
    }

    public void methodB() {
        this.subClassB.doSomethingB();
    }

    public void methodC() {
        this.subClassC.doSomethingC();
    }

}
