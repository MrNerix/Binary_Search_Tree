public class BinaryTreeNode<T> {
    private T elm;
    private BinaryTreeNode<T> leftChild;
    private BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T elm){
        this.elm = elm;
        this.leftChild = null;
        this.rightChild = null;
    }


    public T getElement() {
        return elm;
    }

    public void setElement(T elm) {
        this.elm = elm;
    }

    public BinaryTreeNode<T> getLeftChild() {
        return leftChild;
    }
    public BinaryTreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setLeftChild(BinaryTreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }
    public void setRightChild(BinaryTreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }
}
