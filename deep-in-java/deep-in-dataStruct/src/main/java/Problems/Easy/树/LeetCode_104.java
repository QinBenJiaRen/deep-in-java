package Problems.Easy.树;

/**
 * @Description 二叉书的最大深度
 * @Author jia_h
 * @Date 2021/3/17 18:06
 * @Version 1.0
 */
public class LeetCode_104 {

    /**
     * url:https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
     */
    public static void main(String[] args) {

    }

    /**
     * DFS
     * */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }
        int maxLevel = Integer.MIN_VALUE;
        if (root.left != null) {
            maxLevel = Math.max(maxDepth(root.left), maxLevel);
        }
        if (root.right != null) {
            maxLevel = Math.max(maxDepth(root.right), maxLevel);
        }
        return maxLevel + 1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
