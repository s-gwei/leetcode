package com.sun.leetcode.time2020_11_10;

import org.junit.Test;
import org.springframework.data.mongodb.core.mapping.TextScore;

public class Solution {


    /**
     *1470. 重新排列数组
     * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
     *
     * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
     * 示例 1：
     *
     * 输入：nums = [2,5,1,3,4,7], n = 3
     * 输出：[2,3,5,4,1,7]
     * 解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
     * @param nums
     * @param n
     * @return
     */

    /**
     * 判断数组中旧元素与新元素之间的位置关系
     * 比如x为旧元素位置，y为新元素位置
     * 前面一半：2x=y
     * 后面一半：2(x-n)+1 = y
     */

    @Test
    public void shuffle() {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n=3;
        int[] sort = new int[nums.length];
        for(int i=0;i<nums.length;i++){
           if(i<n){
               sort[2*i] = nums[i];
           }else{
               sort[2*(i-n)+1] = nums[i];
           }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(sort[i]+";");
        }
    }
}
