package Problems.Easy.链表;

/**
 * @Description 反转链表 https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/ 同主站206题
 * @Author jia_h
 * @Date 2021/7/30 13:49
 * @Version 1.0
 */
public class Offer_24 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            // 保存下一个节点
            ListNode next = cur.next;
            // 将当前节点的后继节点指向前一个节点
            cur.next = prev;
            // 慢指针向后移动一位
            prev = cur;
            // 快指针向后移动一位
            cur = next;
        }
        return prev;
    }
}
