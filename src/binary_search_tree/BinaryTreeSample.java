package binary_search_tree;

import java.util.Random;

public class BinaryTreeSample {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        for (int i = 1; i <= 10; i++) {
            tree.insert(-20 + new Random().nextInt(20));
        }
    }
}
