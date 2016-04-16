package binary_search_tree;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;
    public void insert(T value) {
        Node<T> tempNode = new Node<>();
        Node<T> current;
        Node<T> parent;
        tempNode.setValue(value);
        tempNode.setLeftChild(null);
        tempNode.setRightChild(null);
        if (root == null) {
            root = tempNode;
        } else {
            current = root;
            parent = null;
            while (true) {
                parent = current;
                if (value.compareTo(parent.getValue()) < 0) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(tempNode);
                        return;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(tempNode);
                        return;
                    }
                }
            }
        }
    }
}
