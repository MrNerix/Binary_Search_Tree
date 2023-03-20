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
        return 0;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public ArrayList<T> inOrder() {
        return null;
    }

    @Override
    public ArrayList<T> preOrder() {
        return null;
    }

    @Override
    public ArrayList<T> postOrder() {
        return null;
    }

    @Override
    public ArrayList<T> levelOrder() {
        return null;
    }

    @Override
    public int height() {
        /*
        if(root == null){
            return -1;
        }else {
            int leftHeight = 0;
            int rightHeight = 0;
            if()
        }

         */
        return 0;
    }
}
