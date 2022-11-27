package com.hk.design.principle.lsp;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/11/26 21:01
 * @description : 里氏替换原则
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {
        //产生三毛这个士兵
        Soldier sanMao = new Soldier();
        // 给三毛一支枪
        sanMao.setGun(new Rifle());
        sanMao.kill();

        sanMao.setGun(new MachineGun());
        sanMao.kill();

        sanMao.setGun(new ToyGun());
        sanMao.kill();

        sanMao.setGun(new AUG());
        sanMao.kill();

        // 狙击手
        Snipper snipper = new Snipper();
        // 向下转型失败，里氏替换原则失败，子类初出现的地方父类未必就可以出现
        // snipper.shoot((AUG) new Rifle());

    }

}
