package com.hk.design.principle.lsp;

/**
 * @author : HK意境
 * @ClassName : AUG
 * @date : 2022/11/26 21:22
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class AUG extends Rifle{

    public void zoomOut(){
        System.out.println("通过望远镜察看敌人...");
    }

    @Override
    public void shoot() {
        System.out.println("AUG 狙击...");
    }
}
