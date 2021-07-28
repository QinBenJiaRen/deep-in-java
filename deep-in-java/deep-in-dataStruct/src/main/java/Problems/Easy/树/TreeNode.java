package Problems.Easy.树;

/**
 * @Description 树定义
 * @Author jia_h
 * @Date 2021/7/28 11:44
 * @Version 1.0
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;
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
