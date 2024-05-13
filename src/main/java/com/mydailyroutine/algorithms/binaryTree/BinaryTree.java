package com.mydailyroutine.algorithms.binaryTree;

public class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value, BinaryTree left, BinaryTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryTree(int value) {
        this.value = value;
    }

    public int min(BinaryTree root) {
        int min = root.value;

        if (root.left == null) {
            return min;
        }

        return min(root.left);
    }
}
