package com.hk.design.pattern.decorator;

/**
 * @author : HK意境
 * @ClassName : Decorator
 * @date : 2022/12/12 14:26
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class Decorator extends Component{

    private Component component;

    public Decorator(Component component) {

        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
