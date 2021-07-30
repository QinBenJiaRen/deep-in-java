package Problems.Easy.链表;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 回文链表（https://leetcode-cn.com/problems/palindrome-linked-list/）
 * @Author jia_h
 * @Date 2021/7/27 15:42
 * @Version 1.0
 */
public class LeetCode_234 {

    /**
     * 借助外部空间存储链表
     * */
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int front = 0;
        int back = list.size() - 1;
        while (front < back) {
            if (list.get(front) != list.get(back)) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    /**
     * 快慢指针
     * */
    public boolean isPalindrome2(ListNode head){
        return false;
    }
}
