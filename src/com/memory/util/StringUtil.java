package com.memory.util;

import java.util.Stack;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/27 10:13
 */
public class StringUtil {

    /**
     * reverse string
     */
    public static String reverse(String str) {
        Stack<Character> chars = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            chars.push(str.charAt(i));
        }
        char[] srahc = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            srahc[i] = chars.pop();
        }
        return String.valueOf(srahc);
    }

    public static String reverse2(String str) {
        int len = str.length();
        char[] srahc = new char[len];
        for (int i = 0; i < len; i++) {
            srahc[i] = str.charAt(len - 1 - i);
        }
        return String.valueOf(srahc);
    }
}
