package com.nine.data.structure.stack;

/**
 *  栈
 *  后进先出：LIFO(last in first out)
 */
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    /** 入栈*/
    void push(E e);
    /** 出栈*/
    E pop();
    /** 查看栈顶的对象*/
    E peek();

}
