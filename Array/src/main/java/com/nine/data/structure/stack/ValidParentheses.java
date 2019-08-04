package com.nine.data.structure.stack;

import java.util.Stack;

/**
 * @desc leetcode 20: 验证括号是否完全闭合
 * @author 月在未央
 * @date 2019/8/4 16:27
 **/
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if(c==')'&&topChar!='('){
                    return false;
                }
                if(c==']'&&topChar!='['){
                    return false;
                }
                if(c=='}'&&topChar!='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
