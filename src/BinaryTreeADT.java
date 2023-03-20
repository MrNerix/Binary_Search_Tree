import java.util.ArrayList;

public interface BinaryTreeADT<T> {
    public BinaryTreeNode getRoot();
    public void setRoot(BinaryTreeNode binaryTreeNode);
    public boolean isEmpty();
    public int size(BinaryTreeNode node);
    public boolean contains(BinaryTreeNode node, T element);
    public ArrayList<T> inOrder(BinaryTreeNode node);
    public ArrayList<T> preOrder(BinaryTreeNode node);
    public ArrayList<T> postOrder(BinaryTreeNode node);
    public ArrayList<T> levelOrder(BinaryTreeNode node);
    public int height(BinaryTreeNode temp);


}
