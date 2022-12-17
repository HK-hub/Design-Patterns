package com.hk.design.pattern.adapter.simple;

import com.hk.design.pattern.adapter.simple.adaptee.IUserInfo;
import com.hk.design.pattern.adapter.simple.adaptee.UserInfo;
import com.hk.design.pattern.adapter.simple.adapter.OuterUserInfo;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/17 21:33
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {


    public static void main(String[] args) {

        IUserInfo girlInfo = new OuterUserInfo();
        for (int i = 0; i < 101; i++) {
            girlInfo.getMobileNumber();
        }

    }


}
