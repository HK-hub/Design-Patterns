package com.hk.design.pattern.decorator;

/**
 * @author : HK意境
 * @ClassName : ConcreteDecorator
 * @date : 2022/12/12 14:28
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }


    @Override
    public void operation() {
        this.addtionalOperation();
        super.operation();
    }

    private void addtionalOperation() {
        System.out.println("动态添加的功能职责1");
    }

}
