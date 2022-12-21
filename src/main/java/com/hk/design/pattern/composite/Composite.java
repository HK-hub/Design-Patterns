package com.hk.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : HK意境
 * @ClassName : Composite
 * @date : 2022/12/21 20:43
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Composite extends Component {

    private List<Component> componentList = new ArrayList<Component>();


    //增加一个叶子构件或树枝构件
    public void add(Component component) {
        this.componentList.add(component);
    }

    //删除一个叶子构件或树枝构件
    public void remove(Component component) {
        this.componentList.remove(component);
    }

    //获得分支下的所有叶子构件和树枝构件
    public List<Component> getChildren() {
        return this.componentList;
    }

}
