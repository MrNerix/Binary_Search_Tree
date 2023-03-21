import java.util.ArrayList;

public interface BinaryTreeADT<T> {
    BinaryTreeNode<T> getRoot();
    void setRoot(BinaryTreeNode<T> binaryTreeNode);
    boolean isEmpty();
    int size();
    boolean contains(T element);
    ArrayList<T> inOrder();
    ArrayList<T> preOrder();
    ArrayList<T> postOrder();
    ArrayList<T> levelOrder();
    int height();


}
