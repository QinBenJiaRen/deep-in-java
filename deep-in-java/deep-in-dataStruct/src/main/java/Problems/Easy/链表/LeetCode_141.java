package Problems.Easy.链表;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description 环形链表
 * @Author jia_h
 * @Date 2021/1/11 9:50
 * @Version 1.0
 */
public class LeetCode_141 {

    /**
     * url:https://leetcode-cn.com/problems/linked-list-cycle/
     * */

    public static void main(String[] args) {

    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        while (head != null) {
            if (map.get(head) == null) {
                map.put(head, 1);
                head = head.next;
            } else {
                return true;
            }
        }
        return false;
    }
}
