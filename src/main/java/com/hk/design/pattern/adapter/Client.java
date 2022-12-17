package com.hk.design.pattern.adapter;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/17 19:35
 * @description : 适配器模式：将一个类的接口变换成客户端所期望的另一个类的接口，
 *                              从而使原本两个因接口不匹配而无法在一起工作的两个类能够在一起工作
 *                分类：对象适配器，类适配器，
 *                          通常情况下对象适配器比类适配器具有更好的扩展性，关联性，
 *                                  可以解决Java原生只支持单继承带来的短板，并且在进行业务扩展的时候更加能够修补源类的缺陷，
 *                                  更好的与其他类进行关联；并且通过聚合的方式带来的耦合性小于通过继承带来的耦合性
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        //原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        //现在增加了适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();

    }


}
