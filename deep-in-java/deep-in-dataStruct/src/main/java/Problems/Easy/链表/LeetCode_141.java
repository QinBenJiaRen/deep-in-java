package Problems.Easy.链表;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 环形链表 url:https://leetcode-cn.com/problems/linked-list-cycle/
 * @Author jia_h
 * @Date 2021/1/11 9:50
 * @Version 1.0
 */
public class LeetCode_141 {

    public static void main(String[] args) {

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
