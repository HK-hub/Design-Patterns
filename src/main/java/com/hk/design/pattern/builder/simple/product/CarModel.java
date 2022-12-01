package com.hk.design.pattern.builder.simple.product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : HK意境
 * @ClassName : CarModel
 * @date : 2022/12/1 19:43
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class CarModel {


    protected List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    // 扩展的模板方法
    public void run() {

        for (String fun : this.sequence) {
            if ("start".equalsIgnoreCase(fun)) {
                this.start();
            } else if ("stop".equalsIgnoreCase(fun)) {
                this.stop();
            } else if ("alarm".equalsIgnoreCase(fun)) {
                this.alarm();
            } else if ("engineBoom".equalsIgnoreCase(fun)) {
                this.engineBoom();
            }
        }

    }

    public final void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }


}
