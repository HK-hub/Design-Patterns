package com.hk.design.pattern.iterator.iterable;


import com.hk.design.pattern.iterator.aggregate.Aggregate;
import com.hk.design.pattern.iterator.aggregate.ConcreteAggregate;

/**
 * @author : HK意境
 * @ClassName : ConcreteIterator
 * @date : 2022/12/18 19:35
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class ConcreteIterator<E> implements Iterator<E>{

    private Aggregate<E> aggregate;
    private int cursor = 0;

    public ConcreteIterator(ConcreteAggregate<E> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {

        if (this.aggregate == null || this.cursor >= this.aggregate.size()) {
            return false;
        }
        return true;
    }

    @Override
    public E next() {
       return this.aggregate.get(this.cursor++);
    }

    @Override
    public E remove() {
        E e = this.aggregate.get(this.cursor);
        this.aggregate.remove(this.aggregate.get(this.cursor));

        return e;
    }

    @Override
    public E first() {
        return this.aggregate.get(0);
    }

    @Override
    public E current() {
        return this.aggregate.get(this.cursor);
    }

    @Override
    public boolean isDone() {
        return this.hasNext();
    }
}

