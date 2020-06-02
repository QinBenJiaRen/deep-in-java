package Tree;

public class TreeDemo {

    public static Tree init() {
        Tree node1 = new Tree(1);
        Tree node2 = new Tree(2);
        Tree node3 = new Tree(3);
        Tree node4 = new Tree(4);
        Tree node5 = new Tree(5);
        Tree node6 = new Tree(6);
        Tree node7 = new Tree(7);
        Tree node8 = new Tree(8);
        Tree node9 = new Tree(9);

        node1.leftNode = node2;
        node1.rightNode = node3;
        node2.leftNode = node4;
        node2.rightNode = node5;
        node3.leftNode = node6;
        node3.rightNode = node7;
        node5.leftNode = node8;
        node7.rightNode = node9;
        return node1;
    }
}
