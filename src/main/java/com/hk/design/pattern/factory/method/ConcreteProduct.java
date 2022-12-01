package com.hk.design.pattern.factory.method;

/**
 * @author : HK意境
 * @ClassName : ConcreteProduct
 * @date : 2022/11/30 19:21
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteProduct extends Product{
    @Override
    public void commonLogic() {
        System.out.println("具体产品逻辑1");
    }
}
