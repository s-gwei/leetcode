package com.sun.leetcode.time2020_11_10;


import org.junit.Test;

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，
 * 该函数将返回左旋转两位得到的结果"cdefgab"。
 * 示例 1：
 *
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"

 */
public class Solution4 {

    /**
     *执行结果：
     * 通过
     * 显示详情
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
     * 内存消耗：38.3 MB, 在所有 Java 提交中击败了87.23% 的用户
     * @param s
     * @param n
     */
    @Test
    public void  reverseLeftWords(String s, int n) {

        String a= s.substring(0,n);
        String b=s.substring(n);
        s = b+a;
    }
}
