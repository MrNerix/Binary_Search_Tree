public class Main {
    public static void main(String[] args) {
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