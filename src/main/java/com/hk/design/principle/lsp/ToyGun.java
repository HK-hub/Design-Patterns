package com.hk.design.principle.lsp;

/**
 * @author : HK意境
 * @ClassName : ToyGun
 * @date : 2022/11/26 21:17
 * @description : 玩具枪
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ToyGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("糟糕，玩具枪");
    }
}
