package com.hk.design.principle.lsp;

import lombok.Data;

/**
 * @author : HK意境
 * @ClassName : Soldier
 * @date : 2022/11/26 21:08
 * @description : 士兵类
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Data
public class Soldier {

    // 士兵的枪支
    private AbstractGun gun;

    // 击杀
    public void kill() {
        System.out.println("士兵开始杀敌人...");
        gun.shoot();


    }



}
