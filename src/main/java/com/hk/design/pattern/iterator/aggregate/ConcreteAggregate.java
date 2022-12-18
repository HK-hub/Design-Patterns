package com.hk.design.pattern.iterator.aggregate;


import com.hk.design.pattern.iterator.iterable.ConcreteIterator;
import com.hk.design.pattern.iterator.iterable.Iterator;

import java.util.Objects;

/**
 * @author : HK意境
 * @ClassName : ConcreteAggregate
 * @date : 2022/12/18 19:34
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteAggregate<E> implements Aggregate<E>{

    private int initialCapacity = 16;
    private int size = 0;
    private E[] elements ;

    public ConcreteAggregate(int initialCapacity) {

        this.initialCapacity = initialCapacity;
        this.elements = (E[]) new Object[initialCapacity];
    }

    public ConcreteAggregate() {
        this(16);
    }

    @Override
    public E get(int index) {
        return this.elements[index];
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<>(this);
    }

    @Override
    public void add(E element) {
        this.elements[this.size++] = element;
    }

    @Override
    public void remove(E element) {
        int i = 0;
        for (E e : this.elements) {
            if (Objects.equals(e, element)) {
                this.elements[i] = null;
                this.size--;
                return;
            }
            i++;
        }
    }

    @Override
    public int size() {
        return this.size;
    }
}