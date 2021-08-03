package Problems.Easy.链表;

/**
 * @Description 删除链表中的节点 https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @Author jia_h
 * @Date 2021/8/3 11:27
 * @Version 1.0
 */
public class LeetCode_237 {

    /**
     * 因为无法操作需要删除节点的前一个节点，所以将当前需要删除的节点值替换成下一个节点的值，然后再将该节点删除
     * */
    public void deleteNode(ListNode node) {

        node.val = node.next.val;

        node.next = node.next.next;

    }
}
