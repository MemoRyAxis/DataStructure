package com.memory.algorithm.stack;

/**
 * @author MemoRyAxis
 * @todo reverse string by stack
 * @date 2014/8/27 9:58
 */
public class Reverse {
    private char[] chars;
    private int size;
    private int cursor;

    public Reverse(String str) {
        this.chars = str.toCharArray();
        this.size = chars.length;
        this.cursor = chars.length - 1;
    }

    public void push(char c) {
        chars[++cursor] = c;
    }

    public char pop() {
        return chars[cursor--];
    }

    public static String reverse(String str) {
        Reverse re = new Reverse(str);
        char[] newStr = new char[str.length()];
        for (int i = 0; i < newStr.length; i++) {
            newStr[i] = re.pop();
        }
        return String.valueOf(newStr);
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(Reverse.reverse(str));
    }
}
