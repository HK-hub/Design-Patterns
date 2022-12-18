package com.hk.design.pattern.iterator.simple;

import com.hk.design.pattern.iterator.simple.iterable.ProjectIterator;

/**
 * @author : HK意境
 * @ClassName : IProject
 * @date : 2022/12/18 12:56
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public interface IProject {

    // 添加工程
    public void add(String name, int num, long cost);

    public String getProjectInfo();

    // 获得一个可被便利的对象
    public ProjectIterator iterator();

}
