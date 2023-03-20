public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BinaryTreePrint binaryTreePrint = new BinaryTreePrint();
        BinaryTreeNode tree = new BinaryTreeNode<>(1);
        tree.setLeftChild(new BinaryTreeNode<>(2));
        tree.setRightChild(new BinaryTreeNode<>(3));
        tree.getLeftChild().setLeftChild(new BinaryTreeNode<>(4));
        tree.getLeftChild().setRightChild(new BinaryTreeNode<>(5));
        tree.getRightChild().setLeftChild(new BinaryTreeNode<>(5));
        tree.getRightChild().setRightChild(new BinaryTreeNode<>(5));
        //binaryTreePrint.root = tree;

        BinaryTree binaryTree = new BinaryTree<>();
        binaryTree.root =  tree;
        binaryTreePrint.printTree(binaryTree.root);



    }
}