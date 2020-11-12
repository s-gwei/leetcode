package com.sun.leetcode.time2020_11_12;

import org.junit.Test;

/**
 * 1281. 整数的各位积和之差
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 *
 * 输入：n = 234
 * 输出：15
 * 解释：
 * 各位数之积 = 2 * 3 * 4 = 24
 * 各位数之和 = 2 + 3 + 4 = 9
 * 结果 = 24 - 9 = 15
 */
public class Solution {

    @Test
    public void  subtractProductAndSum() {
        int n = 234;
        int count = n;
        int product = 1;
        int sum = 0;

        for(int i = 0;i < n ;i ++){
            if( count==0){
                break;
            }

            product *=(count % 10);
            sum +=(count % 10);
            count = count / 10;

        }

        System.out.println(product - sum);
    }

}
