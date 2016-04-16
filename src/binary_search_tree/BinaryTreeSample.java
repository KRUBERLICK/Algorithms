package binary_search_tree;

import java.util.Random;

public class BinaryTreeSample {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        int[] sampleTree = { 4, 1, 7, 5, 0, 3 };

        for (int i = 0; i < sampleTree.length; i++) {
            //tree.insert(-20 + new Random().nextInt(20));
            //tree.insert(i);
            tree.insert(sampleTree[i]);
        }
        tree.inOrderTraverse(tree.getRoot());
    }
}
