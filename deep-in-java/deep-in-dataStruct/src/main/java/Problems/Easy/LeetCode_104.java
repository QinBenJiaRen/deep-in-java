package Problems.Easy;

import Tree.Tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Maximum Depth of Binary Tree
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 *
 * 解决方式1：BFS
 * */
public class LeetCode_104 {

    public static void main(String[] args) {

    }

    //BFS解法
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (root.left != null) queue.add(root.left);
                if (root.right != null) queue.add(root.right);
            }
            depth++;
        }
        return depth;
    }

    //DFS解法
    public static int dfsDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }

        return 1 + Math.max(dfsDepth(root.left), dfsDepth(root.right));
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() { }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
