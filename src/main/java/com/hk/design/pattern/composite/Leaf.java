package com.hk.design.pattern.composite;

/**
 * @author : HK意境
 * @ClassName : Leaf
 * @date : 2022/12/21 20:46
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Leaf extends Component{

    @Override
    public void doSomething() {
        System.out.println("客户重写父类方法");
    }
}
