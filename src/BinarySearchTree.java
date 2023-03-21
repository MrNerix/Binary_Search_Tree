import java.util.ArrayList;

public class BinarySearchTree<T> extends BinaryTree<T> implements BinarySearchTreeADT<T>{

    @Override
    public boolean insert(T element){
        insert(root, element);
        return true;
    }
    private BinaryTreeNode<T> insert(BinaryTreeNode<T> node, T element){

        if (node == null) {
            node = new BinaryTreeNode<>(element);
            return node;
        }

        else if ((Integer) element < (Integer) node.getElement())
            node.setLeftChild(insert(node.getLeftChild(), element));
        else if ((Integer) element > (Integer)node.getElement())
            node.setRightChild(insert(node.getRightChild(), element));

        return node;
    }

    @Override
    public boolean removeElement(T element)
    {
        if(!contains(element))
            return false;
        else {
            removeElement(root, element);
            return true;
        }
    }
    private BinaryTreeNode<T> removeElement(BinaryTreeNode<T> node, T element){
        if (node == null)
            return node;
        if ((Integer)element < (Integer) node.getElement())
            node.setLeftChild(removeElement(node.getLeftChild(), element));
        else if ((Integer) element > (Integer)node.getElement())
            node.setRightChild(removeElement(node.getRightChild(), element));

        else {
            if (node.getLeftChild() == null)
                return node.getRightChild();
            else if (node.getRightChild() == null)
                return node.getLeftChild();

            node.setElement(findMin(node.getRightChild()));

            node.setRightChild(removeElement(node.getRightChild(), node.getElement()));
        }
        return node;
    }
    @Override
    public T findMin()
    {
        return (T) findMin(root);
    }
    private T findMin(BinaryTreeNode<T> node){
        T minv = (T) node.getElement();
        while (node.getLeftChild() != null) {
            minv = (T) node.getLeftChild().getElement();
            node = node.getLeftChild();
        }
        return minv;
    }
    @Override
    public T findMax()
    {
        return findMax(root);
    }
    private T findMax(BinaryTreeNode node){
        T maxv = (T) node.getElement();
        while (node.getRightChild() != null) {
            maxv = (T) node.getRightChild().getElement();
            node = node.getRightChild();
        }
        return maxv;
    }
    @Override
    public void rebalance(){
        root = rebalance(inOrder(), 0, size() - 1);
    }


    private BinaryTreeNode<T> rebalance(ArrayList<T> elements, int start, int end){
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        T element = elements.get(mid);

        BinaryTreeNode node = new BinaryTreeNode(element);

        node.setLeftChild(rebalance(elements, start, mid - 1));
        node.setRightChild(rebalance(elements, mid + 1, end));

        return node;
    }

}
