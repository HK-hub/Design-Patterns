package com.hk.design.principle.isp;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/11/27 14:02
 * @description : 接口隔离原则
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        IGreatTemperamentGirl greatTemperamentGirl = new PettyGirl("张三");
        IGoodBodyGirl goodBodyGirl = new PettyGirl("李四");
        AbstractSearcher searcher = new Searcher(greatTemperamentGirl);

        searcher.show();
        searcher.setGoodBodyGirl(goodBodyGirl);
        searcher.show();

    }

}
