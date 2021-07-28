package Problems.Easy.树;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 二叉树前序遍历（https://leetcode-cn.com/problems/binary-tree-preorder-traversal/）
 * @Author jia_h
 * @Date 2021/7/28 11:43
 * @Version 1.0
 */
public class LeetCode_144 {


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        iterator(root, list);
        return list;
    }

    /**
     * 递归
     * */
    public void iterator(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        iterator(root.left, res);
        iterator(root.right, res);
    }


}
