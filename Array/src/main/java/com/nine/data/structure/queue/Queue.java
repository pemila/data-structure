package com.nine.data.structure.queue;

/**
 * @desc 队列：先进先出 FIFO(first in first out)
 * @author 月在未央
 * @date 2019/8/4 16:45
 **/
public interface Queue<E> {

    /** 入队*/
    void enqueue(E e);
    /** 出队*/
    E dequeue();
    /** 获得队首的元素*/
    E getFront();
    int getSize();
    boolean isEmpty();
}
