package com.hk.design.pattern.iterator;

import com.hk.design.pattern.iterator.aggregate.Aggregate;
import com.hk.design.pattern.iterator.aggregate.ConcreteAggregate;
import com.hk.design.pattern.iterator.iterable.Iterator;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/18 12:55
 * @description : 迭代器模式: provide a way to access the elements of an aggregate objects sequentially without
 *                                exposing its underlying representation
 *                          提供一个方法来访问一个容器内部的元素对象，而又不需要暴露该对象的内部细节
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        Aggregate<String> aggregate = new ConcreteAggregate<>(100);
        aggregate.add("1");
        aggregate.add("11");
        aggregate.add("111");
        aggregate.add("12");
        aggregate.add("31");
        aggregate.add("51");
        aggregate.add("178");

        Iterator<String> iterator = aggregate.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }


    }

}
