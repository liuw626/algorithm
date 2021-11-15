package com.godric.v21_11.algo;

import com.godric.v21_11.common.Node;

/**
 * 反转链表: 单链表 & 双链表
 */
public class C10_ReverseList {

    public Node reverseLinkedListByRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node next = head.next;
        Node newHead = reverseLinkedListByRecursive(next);
        next.next = head;
        head.next = null;

        return newHead;
    }


}
