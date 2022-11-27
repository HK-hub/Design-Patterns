package com.hk.design.principle.lod;

import lombok.Data;
import lombok.ToString;

import java.util.concurrent.atomic.LongAdder;


/**
 * @author : HK意境
 * @ClassName : Girl
 * @date : 2022/11/27 14:50
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Data
@ToString
public class Girl {

    private String name;
    public static final LongAdder adder = new LongAdder();

    public Girl() {

        this.name = "女孩:" + adder.intValue();
        adder.increment();

    }
}
