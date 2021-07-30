package Problems.Easy.链表;

/**
 * @Description 反转链表 https://leetcode-cn.com/problems/reverse-linked-list/
 * @Author jia_h
 * @Date 2021/2/3 10:01
 * @Version 1.0
 */
public class LeetCode_206 {

    /**
     * 双指针法
     * prev指针指向空，cur指针当前节点，不断遍历cur
     * 每遍历一次，cur指向下一个节点
     * */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null; // 指向null
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            //反转关键代码
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}


