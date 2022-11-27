package com.hk.design.principle.lsp;

/**
 * @author : HK意境
 * @ClassName : Snipper
 * @date : 2022/11/26 21:24
 * @description : 狙击手
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Snipper {

    public void shoot(AUG aug) {
        // 观察
        aug.zoomOut();
        // 射击
        aug.shoot();
    }

}
