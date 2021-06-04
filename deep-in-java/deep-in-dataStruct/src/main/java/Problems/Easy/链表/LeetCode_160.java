package Problems.Easy.链表;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 相交链表
 * @Author jia_h
 * @Date 2021/6/4 10:16
 * @Version 1.0
 */
public class LeetCode_160 {

    /**
     * url:https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
     * */
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    /**
     * 解法1：哈希表
     * */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode tmp = headA;
        while (tmp != null) {
            set.add(tmp);
            tmp = tmp.next;
        }
        ListNode tmp2 = headB;
        while (tmp2 != null) {
            if (set.contains(tmp2)) {
                return tmp2;
            }
            tmp2 = tmp2.next;
        }
        return null;
    }

    /**
     * 解法2：双指针法
     * */



}
