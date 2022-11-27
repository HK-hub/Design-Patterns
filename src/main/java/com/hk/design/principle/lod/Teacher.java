package com.hk.design.principle.lod;

/**
 * @author : HK意境
 * @ClassName : Teacher
 * @date : 2022/11/27 14:49
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Teacher {

    public void command(GroupLeader groupLeader) {
        // 点名
        groupLeader.countGirls();
    }

}
