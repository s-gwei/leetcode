package com.sun.leetcode.time2020_11_12;

/**
 *LCP 06. 拿硬币
 * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。
 * 我们每次可以选择任意一堆，拿走其中的一枚或者两枚，
 * 求拿完所有力扣币的最少次数。
 * 示例 1：
 *
 *     输入：[4,2,1]
 *
 *     输出：4
 *
 *     解释：第一堆力扣币最少需要拿 2 次，第二堆最少需要拿 1 次，第三堆最少需要拿 1 次，总共 4 次即可拿完。
 *
 *
 */
public class Solution3 {
    public int minCount(int[] coins) {

        int sum = 0;
        for(int coin : coins){
            int count = coin%2 == 0? coin/2:coin/2+1;
            sum +=count;
        }
        return sum;
    }
}
