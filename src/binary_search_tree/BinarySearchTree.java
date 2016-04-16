package binary_search_tree;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

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

    public Node<T> search(T value) {

        if (root == null) {
            return null;
        }

        Node<T> current = root;

        while (current != null) {
            if (value.compareTo(current.getValue()) == 0) {

                return current;

            } else if (value.compareTo(current.getValue()) < 0) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }

        return null;
    }

    public void preOrderTraverse(Node<T> root) {
        if (root != null) {
            System.out.print(root.getValue() + " ");
            preOrderTraverse(root.getLeftChild());
            preOrderTraverse(root.getRightChild());
        }
    }

    public void postOrderTraverse(Node<T> root) {
        if (root != null) {
            postOrderTraverse(root.getLeftChild());
            postOrderTraverse(root.getRightChild());
            System.out.print(root.getValue() + " ");
        }
    }

    public void inOrderTraverse(Node<T> root) {
        if (root != null) {
            inOrderTraverse(root.getLeftChild());
            System.out.print(root.getValue() + " ");
            inOrderTraverse(root.getRightChild());
        }
    }
}
