package Problems.Easy.链表;

/**
 * @Description 合并两个有序链表
 * @Author jia_h
 * @Date 2021/3/16 9:34
 * @Version 1.0
 */
public class LeetCode_21 {

    /**
     * url:https://leetcode-cn.com/problems/merge-two-sorted-lists/
     */
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 1;
        ListNode next = new ListNode();
        next.val = 2;
        l1.next = next;
        ListNode nextNext = new ListNode();
        nextNext.val = 3;
        next.next = nextNext;

        ListNode l2 = new ListNode();
        l2.val = 1;
        ListNode llNext = new ListNode();
        llNext.val = 3;
        l2.next = llNext;
        ListNode llNextNext = new ListNode();
        llNextNext.val = 4;
        llNext = llNextNext;
        mergeTwoLists(l1, l2);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return l1;
        } else if (l1 == null) {
            return l1;
        } else if (l2 == null) {
            return l2;
        } else if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
