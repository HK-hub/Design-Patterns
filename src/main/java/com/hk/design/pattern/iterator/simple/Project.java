package com.hk.design.pattern.iterator.simple;

import com.hk.design.pattern.iterator.simple.iterable.ProjectIterator;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : HK意境
 * @ClassName : Project
 * @date : 2022/12/18 12:56
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Data
@ToString
@NoArgsConstructor
public class Project implements IProject{

    @ToString.Exclude
    private List<IProject> projects = new ArrayList<>();


    // 项目名称
    private String name;
    // 项目人员数量
    private int num;
    // 项目费用
    private long cost;

    public Project(String name, int num, long cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }


    @Override
    public void add(String name, int num, long cost) {
        this.projects.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {

        return this.toString();
    }

    @Override
    public ProjectIterator iterator() {
        return new ProjectIterator(this.projects);
    }
}
