package binary_search_tree;

public class Node<T extends Comparable<T>> {

    private T value;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public void setValue(T value) {
        this.value = value;
    }

    public void setLeftChild(Node<T> child) {
        leftChild = child;
    }

    public void setRightChild(Node<T> child) {
        rightChild = child;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }
}
