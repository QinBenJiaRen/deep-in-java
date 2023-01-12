package Problems.Easy.树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description 二叉树前序遍历（https://leetcode-cn.com/problems/binary-tree-preorder-traversal/）
 * @Author jia_h
 * @Date 2021/7/28 11:43
 * @Version 1.0
 */
public class LC_144 {

    /**
     * 树的前序遍历：
     * 访问根节点-左子树-右子树；而访问左子树或者右子树的时候，可按照同样的方式进行遍历，直到遍历完整颗树
     * */


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        iterator(root, list);
        return list;
    }

    /**
     * 递归
     * 时间复杂度：O(n), 其中 n 是二叉树的节点数，每个节点恰好被遍历一次
     * 空间复杂度：O(n), 最差的情况为O(n),此时树呈现链状结构
     * */
    public void iterator(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        iterator(root.left, res);
        iterator(root.right, res);
    }

    /**
     * 使用栈进行迭代
     * 时间复杂度：O(n), 其中 n 是二叉树的节点数，每个节点恰好被遍历一次
     * 空间复杂度：O(n), 最差的情况为O(n),此时树呈现链状结构
     * */
    public List<Integer> iterator_2(TreeNode root) {
        // 保存遍历结果
        List<Integer> res = new ArrayList<>();
        // 维护的栈
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node != null) {
            while (node != null) {
                // 将父节点数值保存到结果集中
                res.add(node.val);
                // 将左子树压入栈中
                stack.push(node);
                node = node.left;
            }
            // 当左子树无子节点后，将栈顶元素推出，开始遍历右子树
            node = stack.pop();
            node = node.right;
        }
        return res;
    }


}
