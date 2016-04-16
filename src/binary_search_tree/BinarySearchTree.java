package binary_search_tree;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;

    public void insert(T value) {
        Node<T> tempNode = new Node<>();
        Node<T> current;

        tempNode.setValue(value);

        if (root == null) {
            root = tempNode;
        } else {
            current = root;
            while (true) {
                if (value.compareTo(current.getValue()) < 0) {
                    if (current.getLeftChild() == null) {
                        current.setLeftChild(tempNode);
                        return;
                    }
                    current = current.getLeftChild();
                } else {
                    if (current.getRightChild() == null) {
                        current.setRightChild(tempNode);
                        return;
                    }
                    current = current.getRightChild();
                }
            }
        }
    }
}
