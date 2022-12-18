package com.hk.design.pattern.iterator.simple;

import com.hk.design.pattern.iterator.simple.iterable.IProjectIterator;

import java.util.ArrayList;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/18 12:55
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        //定义一个List，存放所有的项目对象
        IProject project = new Project();
        //增加星球大战项目
        project.add("星球大战项目", 10, 100000);
        // 增加扭转时空项目
        project.add("扭转时空项目", 100, 10000000);
        // 增加超人改造项目
        project.add("超人改造项目", 10000, 1000000000);
        // 这边100个项目
        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i * 5, i * 1000000);
        }

        //遍历一下ArrayList，把所有的数据都取出
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }

    }

}
