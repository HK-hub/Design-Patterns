package com.hk.design.principle.isp;

import lombok.Data;

/**
 * @author : HK意境
 * @ClassName : PettyGirl
 * @date : 2022/11/27 14:08
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Data
public class PettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {

    private String name;


    public PettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + "：好面容");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "：好身材");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "：好气质");
    }
}
