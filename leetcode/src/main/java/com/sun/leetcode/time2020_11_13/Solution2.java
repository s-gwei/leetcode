package com.sun.leetcode.time2020_11_13;

/**
 *1295. 统计位数为偶数的数字
 * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 * 输入：nums = [12,345,2,6,7896]
 * 输出：2
 * 解释：
 * 12 是 2 位数字（位数为偶数）
 * 345 是 3 位数字（位数为奇数）
 * 2 是 1 位数字（位数为奇数）
 * 6 是 1 位数字 位数为奇数）
 * 7896 是 4 位数字（位数为偶数）
 * 因此只有 12 和 7896 是位数为偶数的数字
 */
public class Solution2 {
    public int findNumbers(int[] nums) {


        int sum = 0;
        for(int in :nums){
            int count = 1;
            int arr = in;
            for(int j = 0;j<in;j++){
                if(arr == 0){
                    break;
                }
                if(arr / 10 >0){
                    arr = arr/10;
                    count ++;
                }
            }
        }
        return sum;
    }
}
