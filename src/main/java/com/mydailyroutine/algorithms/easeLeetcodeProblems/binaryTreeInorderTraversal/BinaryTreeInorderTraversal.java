package com.mydailyroutine.algorithms.easeLeetcodeProblems.binaryTreeInorderTraversal;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal implements AlgosActionDispatcher {

    //Description:
    //Given the root of a binary tree, return the inorder traversal of its nodes' values.


    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    @Override
    public void execute() {
        TreeNode root = new TreeNode();
        inorderTraversal(root);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> values = new ArrayList<>();

        inorderTraversalProcess(root, values);

        return values;
    }

    public void inorderTraversalProcess(TreeNode node, List<Integer> values) {

        if (node.left != null) {
            inorderTraversalProcess(node.left, values);
        }

        values.add(node.val);

        if (node.right != null) {
            inorderTraversalProcess(node.right, values);
        }
    }
}
