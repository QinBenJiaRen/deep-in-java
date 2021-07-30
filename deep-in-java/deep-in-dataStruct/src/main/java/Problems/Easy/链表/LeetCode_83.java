package Problems.Easy.链表;

/**
 * @Description 删除排序链表中的重复元素 url:https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * @Author jia_h
 * @Date 2021/4/23 9:45
 * @Version 1.0
 */
public class LeetCode_83 {

    /**
     *
     */
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
