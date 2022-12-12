package com.hk.design.pattern.decorator;

/**
 * @author : HK意境
 * @ClassName : ConcreteComponent
 * @date : 2022/12/12 14:27
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteComponent extends Component{
    @Override
    public void operation() {
        System.out.println("操作1，职责1");
    }
}
