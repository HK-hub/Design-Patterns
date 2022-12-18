package com.hk.design.pattern.iterator.aggregate;

import com.hk.design.pattern.iterator.iterable.Iterator;

import java.util.Collection;

/**
 * @author : HK意境
 * @ClassName : Aggregate
 * @date : 2022/12/18 19:32
 * @description : 容器对象
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public interface Aggregate<E> {

    public E get(int index);


    public Iterator<E> iterator();

    public void add(E element);

    public void remove(E element);

    public int size();

}
