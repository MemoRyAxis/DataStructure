package com.memory.algorithm.stack;

import java.util.Stack;

/**
 * @author MemoRyAxis
 * @todo check bracket by stack
 * @date 2014/8/27 12:11
 */
public class BracketChecker {


    public static void check(String code) {
        int len = code.length();
        Stack<Character> stack = new Stack<Character>();
        fo:
        for (int i = 0; i < len; i++) {
            char tempChar = code.charAt(i);
            switch (tempChar) {
                case '(':
                case '[':
                case '{':
                    stack.push(tempChar);
                    break;
                case ')':
                case ']':
                case '}':
                    if (!stack.isEmpty()) {
                        char outChar = stack.pop();
                        if (!((outChar == '(' && tempChar == ')') ||
                                (outChar == '[' && tempChar == ']') ||
                                (outChar == '{' && tempChar == '}'))) {
                            System.out.println("error '" + tempChar + "' at " + i);
                            break fo;
                        }
                    }
                default:
                    break;
            }
            if (i == len - 1)
                System.out.println("success");
        }
    }

    public static void main(String[] args) {
        String str = "{[]}";
        BracketChecker.check(str);
    }
}
