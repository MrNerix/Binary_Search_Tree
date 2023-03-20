public class Main {
    public static void main(String[] args) {
        BinaryTreePrint binaryTreePrint = new BinaryTreePrint();

        BinaryTree binaryTree = new BinaryTree<>();

        binaryTree.root = new BinaryTreeNode<>(1);

        binaryTree.root.setLeftChild(new BinaryTreeNode<>(2));
        binaryTree.root.setRightChild(new BinaryTreeNode<>(3));
        binaryTree.root.getLeftChild().setLeftChild(new BinaryTreeNode<>(4));
        binaryTree.root.getLeftChild().setRightChild(new BinaryTreeNode<>(5));
        binaryTree.root.getRightChild().setLeftChild(new BinaryTreeNode<>(6));
        binaryTree.root.getRightChild().setRightChild(new BinaryTreeNode<>(7));

        binaryTreePrint.printTree(binaryTree.root);
        System.out.println(binaryTree.contains(binaryTree.root, 6));
        System.out.println(binaryTree.size(binaryTree.root));
        System.out.println(binaryTree.inOrder(binaryTree.root));
        System.out.println(binaryTree.preOrder(binaryTree.root));
        System.out.println(binaryTree.postOrder(binaryTree.root));
        System.out.println(binaryTree.levelOrder(binaryTree.root));
        System.out.println(binaryTree.height(binaryTree.root));




    }
}