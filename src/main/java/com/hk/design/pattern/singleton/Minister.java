package com.hk.design.pattern.singleton;

/**
 * @author : HK意境
 * @ClassName : Minister
 * @date : 2022/11/30 17:44
 * @description : 臣子类
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Minister {

    public static void main(String[] args) {
        // 三天见的皇帝都是同一个人，荣幸吧！
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }

}
