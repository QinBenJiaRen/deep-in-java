package Problems.Easy.链表;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 相交链表 url:https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * @Author jia_h
 * @Date 2021/6/4 10:16
 * @Version 1.0
 */
public class LeetCode_160 {

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
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB) {
            // A链表遍历结束后遍历B链表
            curA = curA == null ? headB : curA.next;
            // B链表遍历结束后遍历A链表
            curB = curB == null ? headA : curB.next;
        }
        return curA;
    }



}
