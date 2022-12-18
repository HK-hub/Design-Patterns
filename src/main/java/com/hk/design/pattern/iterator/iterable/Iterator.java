package com.hk.design.pattern.iterator.iterable;

/**
 * @author : HK意境
 * @ClassName : Iterator
 * @date : 2022/12/18 19:33
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public interface Iterator<E> {

    public boolean hasNext();

    public E next();

    public E remove();

    public E first();

    public E current();

    public boolean isDone();


}
