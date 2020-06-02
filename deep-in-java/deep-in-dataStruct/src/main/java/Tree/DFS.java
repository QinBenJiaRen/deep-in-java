package Tree;

import java.util.Stack;

/**
 * 深度优先遍历
 * 英文缩写为DFS即Depth First Search.其过程简要来说是对每一个可能的分支路径深入到不能再深入为止，而且每个节点只能访问一次。
 * 深度优先遍历各个节点，需要使用到堆（Stack）这种数据结构。stack的特点是是先进后出。整个遍历过程如下：
 *
 * */
public class DFS {

    public static void main(String[] args) {
        deepFirstSearch(TreeDemo.init());
    }

    public static void deepFirstSearch(Tree tree) {
        Stack<Tree> stack = new Stack<>();
        stack.push(tree);
        while (!stack.isEmpty()) {
            Tree node = stack.pop();
            System.out.println("tree node data : " + node.data);
            //栈是先进后出，所以先右后左
            if (node.rightNode != null) {
                stack.push(node.rightNode);
            }
            if (node.leftNode != null) {
                stack.push(node.leftNode);
            }
        }
        System.out.println();
    }
}
