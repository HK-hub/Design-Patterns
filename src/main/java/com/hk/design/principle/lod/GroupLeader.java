package com.hk.design.principle.lod;

import java.util.List;

/**
 * @author : HK意境
 * @ClassName : GroupLeader
 * @date : 2022/11/27 14:50
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class GroupLeader {

    private List<Girl> girlList;

    public GroupLeader(List<Girl> girlList) {
        this.girlList = girlList;
    }

    public void countGirls() {
        for (Girl girl : this.girlList) {
            System.out.println(girl.getName() + ",到");
        }
    }


}
