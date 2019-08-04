package com.nine.data.structure.queue;

import com.nine.data.structure.array.Array;

/**
 * @desc 数组队列的实现
 * @author 月在未央
 * @date 2019/8/4 16:48
 **/
public class ArrayQueue<E> implements Queue<E> {
    /*
     * 除出隊外其他操作時間複雜度均為O(1)
     * 出隊操作時間複雜度為O(n)
     */

    Array<E> array;

    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayQueue() {
        array = new Array<>();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size=%d,capacity=%d\n", array.getSize(), getCapacity()));
        res.append("front [");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for(int i=0;i<10;i++){
            queue.enqueue(i);
            System.out.println(queue);
            if(i%3==2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
