package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class DeleteNodeInALinkedList implements AlgosActionDispatcher {

    private ListNode head;

    public ListNode initLinkedList() {
        ListNode head = new ListNode(4);
        ListNode nodeFirst = new ListNode(5);
        ListNode nodeSecond = new ListNode(1);
        ListNode nodeThird = new ListNode(9);

        head.next = nodeFirst;
        nodeFirst.next = nodeSecond;
        nodeSecond.next = nodeThird;
        nodeThird.next = null;

        this.head = head;

        return head;
    }

    @Override
    public void execute() {
        ListNode head = initLinkedList();

        int value = 5;
        ListNode node = new ListNode(value);

        deleteNode(node);
    }

    private void deleteNode(ListNode node) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    private void printList(ListNode head) {
        while (head.next != null) {
            System.out.println(head.val);
        }
    }
}
