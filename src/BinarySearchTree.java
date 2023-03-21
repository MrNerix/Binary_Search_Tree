import java.util.ArrayList;

public class BinarySearchTree<T> extends BinaryTree{

    public BinaryTreeNode insert(BinaryTreeNode node, T element){

        if (node == null) {
            node = new BinaryTreeNode(element);
            return node;
        }

        else if ((Integer) element < (Integer) node.getElement())
            node.setLeftChild(insert(node.getLeftChild(), element));
        else if ((Integer) element > (Integer)node.getElement())
            node.setRightChild(insert(node.getRightChild(), element));

        return node;
    }

    public BinaryTreeNode removeElement(BinaryTreeNode node, T element)
    {
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

            node.setRightChild(removeElement(node.getRightChild(), (T) node.getElement()));
        }

        return node;
    }

    public int findMin(BinaryTreeNode node)
    {
        int minv = (Integer) node.getElement();
        while (node.getLeftChild() != null) {
            minv = (Integer) node.getLeftChild().getElement();
            node = node.getLeftChild();
        }
        return minv;
    }
    public int findMax(BinaryTreeNode node)
    {
        int maxv = (Integer) node.getElement();
        while (node.getRightChild() != null) {
            maxv = (Integer) node.getRightChild().getElement();
            node = node.getRightChild();
        }
        return maxv;
    }


    public BinaryTreeNode<T> reBalance(ArrayList<T> elements, int start, int end){
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        T element = elements.get(mid);

        BinaryTreeNode node = new BinaryTreeNode(element);

        node.setLeftChild(reBalance(elements, start, mid - 1));
        node.setRightChild(reBalance(elements, mid + 1, end));

        return node;
    }

}
