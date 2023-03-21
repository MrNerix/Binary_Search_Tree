import java.util.ArrayList;

public class BinaryTree<T> implements BinaryTreeADT<T> {
    BinaryTreeNode root;
    ArrayList<T> inOrder = new ArrayList<T>();
    ArrayList<T> preOrder = new ArrayList<T>();
    ArrayList<T> postOrder = new ArrayList<T>();
    ArrayList<T> levelOrder = new ArrayList<T>();

    public BinaryTree(){
        root = null;
    }

    @Override
    public BinaryTreeNode getRoot() {
        return root;
    }

    @Override
    public void setRoot(BinaryTreeNode binaryTreeNode) {
        root = binaryTreeNode;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public int size(BinaryTreeNode node) {
        if (node == null)
            return 0;
        else
            return (size(node.getLeftChild()) + 1 + size(node.getRightChild()));
    }

    @Override
    public boolean contains(BinaryTreeNode node,T element) {
        if(node == null)
            return false;
        if(node.getElement() == element)
            return true;
        boolean node1 = contains(node.getLeftChild(), element);
        if(node1) return true;
        boolean node2 = contains(node.getRightChild(), element);
        if (node2) {
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<T> inOrder(BinaryTreeNode node) {


        if (node == null)
            return null;
        inOrder(node.getLeftChild());

        inOrder.add( (T) node.getElement());

        inOrder(node.getRightChild());

        return inOrder;
    }

    @Override
    public ArrayList<T> preOrder(BinaryTreeNode node) {
        if (node == null)
            return null;
        preOrder.add( (T) node.getElement());

        preOrder(node.getLeftChild());
        preOrder(node.getRightChild());
        return preOrder;
    }

    @Override
    public ArrayList<T> postOrder(BinaryTreeNode node) {
        if (node == null)
            return null;
        postOrder(node.getLeftChild());
        postOrder(node.getRightChild());
        postOrder.add((T) node.getElement());
        return postOrder;
    }

    @Override
    public ArrayList<T> levelOrder(BinaryTreeNode node) {
        for (int i = 1; i <= height(root); i++){
            currentLevel(root, i);
        }


        return levelOrder;
    }
    void currentLevel(BinaryTreeNode node, int level)
    {
        if (root == null)
            return;
        if (level == 1 && node != null)
            levelOrder.add((T) node.getElement());
        else if (level > 1) {
            currentLevel(node.getLeftChild(), level - 1);
            currentLevel(node.getRightChild(), level - 1);
        }
    }

    @Override
    public int height(BinaryTreeNode temp) {

        if(root == null){
            return -1;
        }else {
            int leftHeight = 0;
            int rightHeight = 0;
            if(temp.getLeftChild() != null){
                leftHeight = height(temp.getLeftChild());
            }
            if(temp.getRightChild() != null) {
                rightHeight = height(temp.getRightChild());
            }

            int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;

            return (max + 1);

        }
    }
}
