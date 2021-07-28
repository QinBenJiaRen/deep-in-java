package Problems.Easy.树;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 二叉树的中序遍历（https://leetcode-cn.com/problems/binary-tree-inorder-traversal/）
 * @Author jia_h
 * @Date 2021/7/28 10:54
 * @Version 1.0
 */
public class LeetCode_94 {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

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
}
