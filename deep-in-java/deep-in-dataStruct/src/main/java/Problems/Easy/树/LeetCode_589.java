package Problems.Easy.树;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Description N叉树的前序遍历
 * @Author jia_h
 * @Date 2021/3/24 9:48
 * @Version 1.0
 */
public class LeetCode_589 {

    /**
     * url:https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
     */
    public static void main(String[] args) {

    }

    public List<Integer> preorder(Node root) {
        Stack<Node> stack = new Stack<>();
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            res.add(node.val);
            /**
             * 栈的特点：先进后出
             * 如一个节点u的子节点分别为v1,v2,v3,那么推入栈的顺序应该为v3,v2,v1，因而需要对子节点进行顺序翻转
             * */
            Collections.reverse(node.children);
            for (Node children: node.children) {
                stack.add(children);
            }
        }
        return res;
    }

    public class Node {
        int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            this.val = _val;
        }

        public Node(int _val, List<Node> _children) {
            this.val = _val;
            this.children = _children;
        }
    }
}
