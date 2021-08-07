package Problems.Easy.链表;

/**
 * @Description 链表中倒数第k个节点 https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 * @Author jia_h
 * @Date 2021/8/6 9:47
 * @Version 1.0
 */
public class Offer_22 {

    public static void main(String[] args) {

    }

    /**
     * 快慢指针
     * fast
     * slow
     * fast 先往前走(n-k)步后，slow开始往后移动
     * fast 继续往前移动，fast每往前移动一步，slow也往后一步
     * 当fast移动结束完成后，slow正好停在(n-k)处的节点，返回slow即可
     * */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
