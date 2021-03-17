package Problems.Easy.树;

/**
 * @Description 二叉数的最小深度
 * @Author jia_h
 * @Date 2021/3/17 10:30
 * @Version 1.0
 */
public class LeetCode_111 {

    /**
     * url:https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
     */
    public static void main(String[] args) {

    }

    /**
     * DFS
     * */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int minLevel = Integer.MAX_VALUE;
        if (root.left != null) {
            minLevel = Math.min(minDepth(root.left), minLevel);
        }
        if (root.right != null) {
            minLevel = Math.min(minDepth(root.right), minLevel);
        }
        return minLevel + 1;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

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
