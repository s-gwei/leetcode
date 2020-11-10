package com.sun.leetcode.time2020_11_10;

public class Solution3 {

    /**
     * 771. 宝石与石头
     *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
     *
     * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
     *
     * 示例 1:
     *
     * 输入: J = "aA", S = "aAAbbbb"
     * 输出: 3
     * @param J
     * @param S
     * @return
     */

    /**
     * 执行结果：
     * 通过
     * 显示详情
     * 执行用时：8 ms, 在所有 Java 提交中击败了5.54% 的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了5.02% 的用户
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {

        String[] str = S.split("");
        String[] Jstr = J.split("");
        int count = 0;
        for(int i=0;i<str.length;i++){
            for(int j =0;j<Jstr.length;j++){
                if(str[i].equals(Jstr[j])){
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 另一种解法
     * 执行结果：
     * 通过
     * 显示详情
     * 执行用时：1 ms, 在所有 Java 提交中击败了98.33% 的用户
     * 内存消耗：36.7 MB, 在所有 Java 提交中击败了96.04% 的用户
     *
     */
    public int numJewelsInStones1(String J, String S) {

        int count=0;
        for(char s: S.toCharArray()){
            for(char j :J.toCharArray()){
                if(s==j){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
