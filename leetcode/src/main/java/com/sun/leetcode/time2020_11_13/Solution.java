package com.sun.leetcode.time2020_11_13;

import org.junit.Test;

/**
 *1342. 将数字变成 0 的操作次数
 *给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。
 *  如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 *
 */
public class Solution {
    @Test
    public void numberOfSteps () {
        int num = 14;
        int total = num;
        int count = 0 ;
        for(int i = 0 ;i<num;i++){
            if(total == 0){
                break;
            }
            if(total % 2 == 0){
                total =total/2;
                count++;
                continue;
            }
            if(total % 2 !=0){
                total=total-1;
                count++;
                continue;
            }
        }
    }



}
