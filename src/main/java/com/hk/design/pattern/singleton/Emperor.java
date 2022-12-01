package com.hk.design.pattern.singleton;

/**
 * @author : HK意境
 * @ClassName : Emperor
 * @date : 2022/11/30 17:43
 * @description : 单例设计模式——皇帝类
 * @Todo : 私有化构造方法，对外提供一个静态的用于获取单例的方法
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Emperor {

    public static final Emperor INSTANCE = new Emperor();
    public final long version = System.currentTimeMillis();

    private Emperor() {
        // 世俗和道德约束你，目的就是不希望产生第二个皇帝
    }

    public static Emperor getInstance() {
        return Emperor.INSTANCE;
    }

    public void say() {
        System.out.println(this.version + ": 我就是皇帝某某某....");

    }

}
