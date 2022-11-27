package com.hk.design.principle.lsp;

/**
 * @author : HK意境
 * @ClassName : MachineGun
 * @date : 2022/11/26 21:08
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class MachineGun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("机枪扫射");
    }
}
