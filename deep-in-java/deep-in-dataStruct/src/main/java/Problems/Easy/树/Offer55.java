package Problems.Easy.树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description 二叉树深度
 * @Author jia_h
 * @Date 2021/3/16 10:22
 * @Version 1.0
 */
public class Offer55 {

    /**
     * https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
     */
    public static void main(String[] args) {

    }

    /**
     * BFS
     * */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            level++;
        }
        return level;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }


}
