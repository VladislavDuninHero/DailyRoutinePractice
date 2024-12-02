package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//There is a singly-linked list head and we want to delete a node node in it.
//
//You are given the node to be deleted node. You will not be given access to the first node of head.
//
//All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
//
//Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
//
//The value of the given node should not exist in the linked list.
//The number of nodes in the linked list should decrease by one.
//All the values before node should be in the same order.
//All the values after node should be in the same order.
//Custom testing:
//
//For the input, you should provide the entire linked list head and the node to be given node. node should not be the last node of the list and should be an actual node in the list.
//We will build the linked list and pass the node to your function.
//The output will be the entire list after calling your function.
//
//
//Example 1:
//
//
//Input: head = [4,5,1,9], node = 5
//Output: [4,1,9]
//Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

public class DeleteNodeInALinkedList implements AlgosActionDispatcher {

    private ListNode head;

    private void initLinkedList() {
        ListNode head = new ListNode(4);
        ListNode nodeFirst = new ListNode(5);
        ListNode nodeSecond = new ListNode(1);
        ListNode nodeThird = new ListNode(9);

        head.next = nodeFirst;
        nodeFirst.next = nodeSecond;
        nodeSecond.next = nodeThird;
        nodeThird.next = null;

        this.head = head;
    }

    @Override
    public void execute() {
        initLinkedList();

        int value = 5;
        ListNode node = new ListNode(value);

        deleteNode(node);

        compileNewList();

        printList(head);
    }

    private void deleteNode(ListNode node) {
        ListNode current = head;

        while (current.next != null) {
            if (current.val == node.val) {
                current.val = 0;
            }

            current = current.next;
        }
    }

    private void compileNewList() {
        ListNode current = head;

        while (current.next != null) {
            if (current.val != 0 && current.next.val == 0) {
                current.next = current.next.next;
            }

            current = current.next;
        }
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    private void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            current = current.next;
        }
    }
}