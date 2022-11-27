package com.hk.design.principle.lsp;



/**
 * @author : HK意境
 * @ClassName : Rifle
 * @date : 2022/11/26 21:06
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public class Rifle extends AbstractGun {

    @Override
    public void shoot() {

        System.out.println("步枪射击...");
    }
}
