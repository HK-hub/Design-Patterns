package com.hk.design.pattern.iterator.simple.iterable;


import com.hk.design.pattern.iterator.simple.IProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author : HK意境
 * @ClassName : ProjectIterator
 * @date : 2022/12/18 13:25
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ProjectIterator implements IProjectIterator {

    private List<IProject> projects = new ArrayList<IProject>();
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projects) {
        this.projects = projects;
    }


    @Override
    public boolean hasNext() {

        if (Objects.isNull(projects)) {
            return false;
        }

        if (this.currentItem >= this.projects.size()) {
            return false;
        }

        return true;
    }

    @Override
    public IProject next() {
        return this.projects.get(this.currentItem++);
    }
}
