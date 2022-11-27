package com.hk.design.principle.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/11/27 14:47
 * @description : 迪米特法则
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        // 把女生名单给体育委员
        List<Girl> girlList = new ArrayList<Girl>(100);
        for (int i = 0; i < 100; i++) {
            girlList.add(new Girl());
        }
        GroupLeader groupLeader = new GroupLeader(girlList);
        teacher.command(groupLeader);
    }


}
