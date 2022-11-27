package com.hk.design.principle.lsp;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : HK意境
 * @ClassName : Handgun
 * @date : 2022/11/26 21:04
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Slf4j
public class Handgun extends AbstractGun{
    @Override
    public void shoot() {
        log.info("手枪开火了");
    }
}
