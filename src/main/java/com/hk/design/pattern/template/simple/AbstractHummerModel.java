package com.hk.design.pattern.template.simple;

/**
 * @author : HK意境
 * @ClassName : AbstractHummerModel
 * @date : 2022/12/1 18:08
 * @description : 抽象悍马模型
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class AbstractHummerModel {

    // 能 发动
    public abstract void start();

    // 能 停止
    public abstract void stop();

    // 能 鸣笛
    public abstract void alarm();

    // 引擎能发出轰鸣声
    public abstract void engineBoom();

    // 能 开动起来
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        String name = this.getClass().getName();
        System.out.println(name + "在公路上跑");
        this.stop();
    }

}
