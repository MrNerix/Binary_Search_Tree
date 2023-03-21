public class Main {
    public static void main(String[] args) {
        /*
        BinaryTreePrint binaryTreePrint = new BinaryTreePrint();

        BinarySearchTree binaryTree = new BinarySearchTree<>();

        binaryTree.root = new BinaryTreeNode<>(6);


        binaryTree.insert(binaryTree.getRoot(),4);
        binaryTree.insert(binaryTree.getRoot(),8);
        binaryTree.insert(binaryTree.getRoot(),3);
        binaryTree.insert(binaryTree.getRoot(),5);
        binaryTree.insert(binaryTree.getRoot(),7);
        binaryTree.insert(binaryTree.getRoot(),9);
        binaryTree.removeElement(binaryTree.root,9);

*/
        BinaryTreePrint binaryTreePrint = new BinaryTreePrint();
        BinarySearchTree binaryTree = new BinarySearchTree<>();

        binaryTree.root = new BinaryTreeNode<>(6);

        binaryTree.root.setLeftChild(new BinaryTreeNode<>(4));
        binaryTree.root.setRightChild(new BinaryTreeNode<>(8));
        //binaryTree.root.getLeftChild().setLeftChild(new BinaryTreeNode<>(3));
        //binaryTree.root.getLeftChild().setRightChild(new BinaryTreeNode<>(5));
        binaryTree.root.getRightChild().setLeftChild(new BinaryTreeNode<>(7));
        binaryTree.root.getRightChild().setRightChild(new BinaryTreeNode<>(9));
        ;


        binaryTreePrint.printTree(binaryTree.root);
        binaryTreePrint.printTree(binaryTree.reBalance(binaryTree.inOrder(binaryTree.root), 0, binaryTree.size(binaryTree.root) - 1));
        System.out.println(binaryTree.contains(binaryTree.root, 6));
        System.out.println(binaryTree.size(binaryTree.root));
        System.out.println(binaryTree.inOrder(binaryTree.root));
        System.out.println(binaryTree.preOrder(binaryTree.root));
        System.out.println(binaryTree.postOrder(binaryTree.root));
        System.out.println(binaryTree.levelOrder(binaryTree.root));
        System.out.println(binaryTree.height(binaryTree.root));





    }
}