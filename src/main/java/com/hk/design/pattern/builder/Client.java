package com.hk.design.pattern.builder;

import com.hk.design.pattern.builder.simple.builder.AbstractCarBuilder;
import com.hk.design.pattern.builder.simple.builder.BMWCarBuilder;
import com.hk.design.pattern.builder.simple.builder.BenzCarBuilder;
import com.hk.design.pattern.builder.simple.product.BenzCarModel;
import com.hk.design.pattern.builder.simple.product.CarModel;
import com.hk.design.principle.dip.BMW;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/1 19:43
 * @description : 建造者模式：将一个复杂对象的构建与他的表示进行分离，使得同样的构建能够有不同的表示
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engineBoom");
        //客户要求，run的时候先发动引擎
        sequence.add("start");
        //启动起来
        sequence.add("stop");
        //开了一段就停下来
        //我们把这个顺序赋予奔驰车

        AbstractCarBuilder carBuilder = new BenzCarBuilder();

        carBuilder.setSequence(sequence);
        carBuilder.getCarModel().run();

        AbstractCarBuilder bmwCarBuilder = new BMWCarBuilder();
        bmwCarBuilder.setSequence(List.of("stop", "start", "engineBoom"));
        bmwCarBuilder.getCarModel().run();



    }

}