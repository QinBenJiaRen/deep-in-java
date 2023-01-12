package Problems.Easy.树;

/**
 * @Description 二叉数的最小深度 https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 * @Author jia_h
 * @Date 2021/3/17 10:30
 * @Version 1.0
 */
public class LC_111 {

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
}
