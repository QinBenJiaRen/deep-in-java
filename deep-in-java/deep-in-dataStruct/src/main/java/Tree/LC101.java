/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Solution {
   public boolean isSymmetric(TreeNode root) {
      return check(root, root);
   }
  
   public boolean check(TreeNode p, TreeNode q) {
      if (p == null && q == null) {
        return true;
      } else if (p == null && q != null) {
        return false;
      } else if (p != null && q == null) {
        return false;
      } else {
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
      }
   }
}
// https://leetcode.cn/problems/symmetric-tree/
