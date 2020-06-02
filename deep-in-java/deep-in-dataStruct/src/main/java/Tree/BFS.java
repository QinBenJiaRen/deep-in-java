package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 广度优先遍历
 * 按层遍历，可基于队列实现
 * */
public class BFS {

    public static void main(String[] args) {
        broadFirstSearch(TreeDemo.init());
    }

    public static void broadFirstSearch(Tree tree) {
        Queue<Tree> queue = new LinkedList<Tree>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            Tree node = queue.poll();
            System.out.println("tree node data: " + node.data);
            //队列是先进先出，所以先左后右
            if (node.leftNode != null) {
                queue.add(node.leftNode);
            }
            if (node.rightNode != null) {
                queue.add(node.rightNode);
            }
        }
        System.out.println();
    }


}
