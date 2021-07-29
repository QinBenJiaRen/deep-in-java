package Problems.Easy.树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description 二叉树的中序遍历（https://leetcode-cn.com/problems/binary-tree-inorder-traversal/）
 * @Author jia_h
 * @Date 2021/7/28 10:54
 * @Version 1.0
 */
public class LeetCode_94 {

    /**
     * 递归
     * 中序遍历：左子树->根节点->右子树
     * 访问左右子树的时候也可以按照同样的方式进行遍历
     * */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        iterator(root, res);
        return res;
    }

    public void iterator(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        iterator(root.left, list);
        list.add(root.val);
        iterator(root.right, list);
    }


    public List<Integer> iterator_2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            // 先遍历左子树，将左子树压入栈中
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            // 当左子树遍历完成后，将左子树结果从栈中压出，同时将结果存入结果集中。在将右子树压入栈中
            node = stack.pop();
            res.add(node.val);
            node = node.right;
        }
        return res;
    }
}
