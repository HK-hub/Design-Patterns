package com.hk.design.pattern.template.simple;

/**
 * @author : HK意境
 * @ClassName : HummerH1Model
 * @date : 2022/12/1 18:11
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class HummerH2Model extends AbstractHummerModel{
    @Override
    public void start() {
        String name = this.getClass().getName();
        System.out.println(name + "启动");
    }

    @Override
    public void stop() {
        String name = this.getClass().getName();
        System.out.println(name + "停止");
    }

    @Override
    public void alarm() {
        String name = this.getClass().getName();
        System.out.println(name + "鸣笛");
    }

    @Override
    public void engineBoom() {
        String name = this.getClass().getName();
        System.out.println(name + "引擎轰鸣");
    }

}
