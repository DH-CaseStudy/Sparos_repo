package day9.tree.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        NodeMgmt myTree = new NodeMgmt();
        myTree.insertNode(11);
        myTree.insertNode(14);
        myTree.insertNode(18);
        myTree.insertNode(16);
        myTree.insertNode(19);
        myTree.insertNode(17);
        myTree.insertNode(7);
        myTree.insertNode(8);
        myTree.insertNode(6);

        System.out.println(myTree.head.right.right.left.right.value);
    }
}
