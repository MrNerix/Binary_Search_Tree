public class Main {
    public static void main(String[] args) {
        BinaryTreePrint binaryTreePrint = new BinaryTreePrint();
        BinarySearchTree binaryTree = new BinarySearchTree<>();

        binaryTree.root = new BinaryTreeNode<>(10);

        binaryTree.root.setLeftChild(new BinaryTreeNode<>(5));
        binaryTree.root.setRightChild(new BinaryTreeNode<>(20));
        binaryTree.root.getLeftChild().setLeftChild(new BinaryTreeNode<>(3));
        binaryTree.root.getRightChild().setLeftChild(new BinaryTreeNode<>(11));
        binaryTree.root.getRightChild().getLeftChild().setRightChild(new BinaryTreeNode<>(19));
        binaryTree.root.getRightChild().setRightChild(new BinaryTreeNode<>(25));

        System.out.println("The Tree before re-balancing:");
        binaryTreePrint.printTree(binaryTree.root);
        binaryTree.rebalance();
        System.out.println("The Tree after re-balancing:");
        binaryTreePrint.printTree(binaryTree.root);
        System.out.println();
        System.out.println("Does it contain the number 6: ");
        System.out.println(binaryTree.contains( 6));
        System.out.println("Size:");
        System.out.println(binaryTree.size());
        System.out.println("In:");
        System.out.println(binaryTree.inOrder());
        System.out.println("Pre:");
        System.out.println(binaryTree.preOrder());
        System.out.println("Post:");
        System.out.println(binaryTree.postOrder());
        System.out.println("Level:");
        System.out.println(binaryTree.levelOrder());
        System.out.println("Height:");
        System.out.println(binaryTree.height());
        System.out.println("Did it insert 21:");
        System.out.println(binaryTree.insert(21));
        System.out.println("Did it remove 21:");
        System.out.println(binaryTree.removeElement(21));

    }
}