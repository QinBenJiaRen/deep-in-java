package Problems.Easy.树;

/**
 * @Description 平衡二叉树
 * @Author jia_h
 * @Date 2021/3/1 10:00
 * @Version 1.0
 */
public class LeetCode_110 {

    /**
     * url:https://leetcode-cn.com/problems/balanced-binary-tree/
     * */
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {

        boolean res = false;


        return res;

    }

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
}
