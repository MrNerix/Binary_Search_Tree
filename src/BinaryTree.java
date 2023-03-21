import java.util.ArrayList;

public class BinaryTree<T> implements BinaryTreeADT<T> {
    BinaryTreeNode root;
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
    public int size() {
        return size(root);
    }
    private int size(BinaryTreeNode node){
        if (node == null)
            return 0;
        else
            return (size(node.getLeftChild()) + 1 + size(node.getRightChild()));
    }

    @Override
    public boolean contains(T element) {
        return contains(root, element);
    }
    private boolean contains(BinaryTreeNode node,T element){
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
    public ArrayList<T> inOrder() {
        ArrayList<T> inOrder = new ArrayList<T>();
        return inOrder(root, inOrder);
    }
    private ArrayList<T> inOrder(BinaryTreeNode node, ArrayList<T> inOrder){
        if (node == null)
            return null;
        inOrder(node.getLeftChild(), inOrder);
        inOrder.add( (T) node.getElement());
        inOrder(node.getRightChild(), inOrder);

        return inOrder;
    }

    @Override
    public ArrayList<T> preOrder() {
        ArrayList<T> preOrder = new ArrayList<T>();
        return preOrder(root, preOrder);
    }
    private ArrayList<T> preOrder(BinaryTreeNode node, ArrayList<T> preOrder){
        if (node == null)
            return null;
        preOrder.add( (T) node.getElement());

        preOrder(node.getLeftChild(), preOrder);
        preOrder(node.getRightChild(), preOrder);
        return preOrder;
    }

    @Override
    public ArrayList<T> postOrder() {
        ArrayList<T> postOrder = new ArrayList<T>();
        return postOrder(root, postOrder);
    }
    private ArrayList<T> postOrder(BinaryTreeNode node, ArrayList<T> postOrder){
        if (node == null)
            return null;
        postOrder(node.getLeftChild(), postOrder);
        postOrder(node.getRightChild(), postOrder);
        postOrder.add((T) node.getElement());
        return postOrder;
    }

    @Override
    public ArrayList<T> levelOrder() {
        ArrayList<T> levelOrder = new ArrayList<>();
        for (int i = 1; i <= height(root); i++){
            currentLevel(root, i, levelOrder);
        }

        return levelOrder;
    }
    void currentLevel(BinaryTreeNode node, int level, ArrayList<T> levelOrder)
    {
        if (node == null)
            return;
        if (level == 1)
            levelOrder.add((T) node.getElement());
        else if (level > 1) {
            currentLevel(node.getLeftChild(), level - 1, levelOrder);
            currentLevel(node.getRightChild(), level - 1, levelOrder);
        }
    }

    @Override
    public int height() {
        return height(root);
    }
    private int height(BinaryTreeNode temp){
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
