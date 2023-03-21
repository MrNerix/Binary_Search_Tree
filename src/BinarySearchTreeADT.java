public interface BinarySearchTreeADT<T> {
    boolean insert(T element);
    boolean removeElement(T element);
    T findMin();
    T findMax();
    void rebalance();
}
