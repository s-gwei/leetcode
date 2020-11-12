package com.sun.leetcode.time2020_11_11;

import org.junit.Test;

/**
 *剑指 Offer 64. 求1+2+…+n
 * 求 1+2+...+n ，要求不能使用乘除法、
 * for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *示例 1：
 *
 * 输入: n = 3
 * 输出: 6
 */
public class Solution3 {
    public static void main(String[] args) {
        sumNums(9);
        System.out.println(sumNums(119));
    }
    //使用递归求解
    public static int sumNums(int n) {

        int sum = n;
        if(sum == 1){
            return 1;
        }else{
            n--;
            sum +=sumNums(n);
        }
        return sum;
    }
}
