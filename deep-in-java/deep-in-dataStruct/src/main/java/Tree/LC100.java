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
    public boolean isSameTree(TreeNode p, TreeNode q) {
      if (p == null && q == null) {
        return true;
      } else if (p == null && q != null) {
        return false;
      } else if (p != null && q == null) {
        return false;
      } else {
        return isSameTree(p.left, q.rigth) && isSameTree(p.right, q.left);
      }
    }
 }
 
 // https://leetcode.cn/problems/same-tree/
