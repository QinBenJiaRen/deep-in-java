package Problems.Easy.树;

/**
 * @Description 平衡二叉树
 * @Author jia_h
 * @Date 2021/3/22 10:23
 * @Version 1.0
 */
public class Offer55II {

    /**
     * https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
     */
    public static void main(String[] args) {

    }

    public static boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Integer.MIN_VALUE;
        if (root.left != null) {
            left = Math.max(maxDepth(root.left), left);
        }
        if (left == -1) {
            return -1;
        }
        int right = Integer.MIN_VALUE;
        if (root.right != null) {
            right = Math.max(maxDepth(root.right), right);
        }
        if (right == -1) {
            return -1;
        }
        return Math.abs(left - right) <= 1 ? Math.max(left, right) + 1 : -1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
