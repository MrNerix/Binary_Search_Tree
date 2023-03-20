import java.util.ArrayList;

public interface BinaryTreeADT<T> {
    public BinaryTreeNode getRoot();
    public void setRoot(BinaryTreeNode binaryTreeNode);
    public boolean isEmpty();
    public int size();
    public boolean contains(T element);
    public ArrayList<T> inOrder();
    public ArrayList<T> preOrder();
    public ArrayList<T> postOrder();
    public ArrayList<T> levelOrder();
    public int height();


}
