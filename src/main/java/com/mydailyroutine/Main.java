package com.mydailyroutine;

import com.mydailyroutine.algorithms.binaryTree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree root =
                new BinaryTree(20, new BinaryTree(7, new BinaryTree(4, null, new BinaryTree(6)), new BinaryTree(9)),
                new BinaryTree(35,
                        new BinaryTree(31, new BinaryTree(28), null),
                new BinaryTree(40, new BinaryTree(38), new BinaryTree(52))));
    }
}