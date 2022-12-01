package com.hk.design.pattern.template;

import com.hk.design.pattern.template.simple.AbstractHummerModel;
import com.hk.design.pattern.template.simple.HummerH1Model;
import com.hk.design.pattern.template.simple.HummerH2Model;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/1 17:56
 * @description : 模板方法模式：定义一个操作中的算法框架，而将一些步骤延迟到其子类中。使得子类可以不改变一个算法的结构即可重定义该算法某些特定步骤
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        AbstractHummerModel hummerH1Model = new HummerH1Model();
        AbstractHummerModel hummerH2Model = new HummerH2Model();
        hummerH1Model.run();
        System.out.println();
        hummerH2Model.run();

        AbstractTemplateClass templateClass1 = new ConcreteTemplateClass1();
        templateClass1.templateMethod();
        System.out.println();
        AbstractTemplateClass templateClass2 = new ConcreteTemplateClass2();
        templateClass2.templateMethod();

    }

}
