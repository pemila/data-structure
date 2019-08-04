package com.nine.data.structure.stack;

/**
 * @desc
 * @author 月在未央
 * @date 2019/8/4 16:14
 **/
public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for(int i=0;i<5;i++){
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}
