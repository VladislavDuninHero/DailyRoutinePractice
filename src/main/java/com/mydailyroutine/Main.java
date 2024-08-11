package com.mydailyroutine;

import com.mydailyroutine.algorithms.binaryTree.BinaryTree;
import com.mydailyroutine.algorithms.easeLeetcodeProblems.SortingTheSentence;
import com.mydailyroutine.algorithms.easeLeetcodeProblems.SumOfUniqueElements;

public class Main {
    public static void main(String[] args) {
        BinaryTree root =
                new BinaryTree(20, new BinaryTree(7, new BinaryTree(4, null, new BinaryTree(6)), new BinaryTree(9)),
                new BinaryTree(35,
                        new BinaryTree(31, new BinaryTree(28), null),
                new BinaryTree(40, new BinaryTree(38), new BinaryTree(52))));

        System.out.println(root.min(root));
        System.out.println(root.max(root));
        System.out.println(root.find(root, 38));

        SortingTheSentence sortingTheSentence = new SortingTheSentence();
        sortingTheSentence.execute();
    }
}