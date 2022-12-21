package com.hk.design.pattern.composite;

import java.util.List;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/21 20:38
 * @description : 组合模式：组合模式又叫整体-部分模式，主要用于描述部分与整体的关系
 * 将对象组合成树形结构以表示部分-整体的层次结构，使得用户对单个对象和组合对象的使用具有一致性。
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        //创建一个根节点
        Composite root = new Composite();
        root.doSomething(); //创建一个树枝构件
        Composite branch = new Composite();
        //创建一个叶子节点
        Leaf leaf = new Leaf();
        // 建立整体
        root.add(branch);
        branch.add(leaf);

        display(root);
    }


    // 通过递归遍历
    public static void display(Composite root) {

        List<Component> children = root.getChildren();
        for (Component child : children) {
            if (child instanceof Leaf) {
                child.doSomething();
            } else {
                display((Composite) child);
            }
        }

    }


}
