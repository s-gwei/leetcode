package com.sun.leetcode.time2020_11_11;

/**
 *实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
 * 示例：
 *
 * 输入：单向链表a->b->c->d->e->f中的节点c
 * 结果：不返回任何数据，但该链表变为a->b->d->e->f
 */
public class Solution {
    /**
     * 单链表删除的另一种思路：直接用后一个节点替换前一个节点
     * @param node
     */
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;


    }

}
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }