package com.nine.data.structure.queue;

import java.util.Random;

/**
 * @desc 数组队列与循环队列的效率比较
 * @author 月在未央
 * @date 2019/8/4 18:40
 **/
public class Main {

    public static void main(String[] args) {
        int optionCount = 100000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        System.out.println(testQueue(arrayQueue,optionCount));
        System.out.println(testQueue(loopQueue,optionCount));
    }

    // 测试Queue进行optionCount次入队出队消耗的时间，单位秒
    public static double testQueue(Queue<Integer> queue, int optionCount){
        long startTime = System.nanoTime();
        Random random = new Random();
        for(int i=0;i<optionCount;i++){
            queue.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for(int i=0;i<optionCount;i++){
            queue.dequeue();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime)/1000000000.0;
    }
}
