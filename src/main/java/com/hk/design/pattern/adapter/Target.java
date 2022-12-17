package com.hk.design.pattern.adapter;

/**
 * @author : HK意境
 * @ClassName : Target
 * @date : 2022/12/17 22:25
 * @description : 目标类(目标接口)：客户端期望转换为的接口类型
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public interface Target {

    public void request();


}


class ConcreteTarget implements Target {


    @Override
    public void request() {
        System.out.println("if you need any help,pls call me!");
    }
}
